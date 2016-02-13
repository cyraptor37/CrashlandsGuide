package com.android.cyraptor.crashlandsguide;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
// import com.pluscubed.recyclerfastscroll.RecyclerFastScroller;
import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

public class ItemsFragment extends Fragment {
    // RecyclerFastScroller mRecyclerFastScroller;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // RecyclerFastScroller RecyclerFastScroller;
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Items");

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.items_recyclerview);

        rv.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        startActivity(new Intent(ItemsFragment.this.getActivity(), Pop.class));
                    }
                })
        );

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        initializeData();

        ItemAdapter adapter = new ItemAdapter(items);
        rv.setAdapter(adapter);

        rv.setAdapter(new AlphaInAnimationAdapter(adapter));

        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(adapter);
        alphaAdapter.setDuration(550);
        rv.setAdapter(alphaAdapter);

        // mRecyclerFastScroller = (RecyclerFastScroller) view.findViewById(R.id.fast_scroller);
        // mRecyclerFastScroller.attachRecyclerView(rv);

        return view;
    }

    private List<Item> items;

    private void initializeData() {
        items = new ArrayList<>();
        items.add(new Item(R.drawable.acidic_fish_food, "Acidic Fish Food", "Tossing this sweet little thing into the acid of the Bawg will attract a new school of fish!", "Seed", "", "", "Good", "Centrifuge", "Ayeayes", 10, "Luminalgae", 1, "Snorble Uvula", 4, "", 0));
        items.add(new Item(R.drawable.alloyonite, "Alloyonite", "It's hard, round, and smooth. Despite its toughness, it has just enough give to make for some pretty good bounces.", "Component", "", "", "Good", "Refinery", "Karboan", 1, "Oilbag", 1, "", 0, "", 0));
        items.add(new Item(R.drawable.alloyonite_stable, "Alloyonite", "Probably the fluffiest, bluffiest creature bed on the entire planet. Aside from the fluffy warmth of your love, that is.", "Creature Stable", "", "", "Normal", "Refinery", "Alloyonite", 4, "Bluffluff", 14, "", 0, "", 0));
        items.add(new Item(R.drawable.ancient_glutterfly_essence, "Ancient Glutterfly Essence", "Being near this essence makes you feel FLUTTERY AND VIVACIOUS!", "Creature Essence", "", "", "Superior", "", "", 0, "", 0, "", 0, "", 0));
        items.add(new Item(R.drawable.ancient_shadowy_wat_essence, "Ancient Shadowy Wat Essence", "Coming near this essence makes you want to poke things with your long, creepy fingers.", "Creature Essence", "", "", "Epic", "", "", 0, "", 0, "", 0, "", 0));
    }
}