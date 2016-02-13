package com.android.cyraptor.crashlandsguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// import com.pluscubed.recyclerfastscroll.RecyclerFastScroller;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

public class TipsFragment extends Fragment {
    // RecyclerFastScroller mRecyclerFastScroller;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // RecyclerFastScroller RecyclerFastScroller;
        View view = inflater.inflate(R.layout.fragment_tips, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("General tips");

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.tips_recyclerview);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        initializeData();

        TipAdapter adapter = new TipAdapter(tips);
        rv.setAdapter(adapter);

        rv.setAdapter(new AlphaInAnimationAdapter(adapter));

        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(adapter);
        alphaAdapter.setDuration(550);
        rv.setAdapter(alphaAdapter);

        // mRecyclerFastScroller = (RecyclerFastScroller) view.findViewById(R.id.fast_scroller);
        // mRecyclerFastScroller.attachRecyclerView(rv);

        return view;
    }

    private List<Tip> tips;

    private void initializeData() {
        tips = new ArrayList<>();
        tips.add(new Tip("Farming", "If it is worth getting, then it is worth over getting, since you have an unlimited amount of inventory space you can have as many of a resource as you want stone for example is a resource that is extremely important and if you have 200 then you will be prepared for any recipe!"));
        tips.add(new Tip("Potions", "Potions are items that are essential because they have a shorter cooldown than healing items you will find in the wild. Another important item to think about is using the right kind of potion, for example if you want to heal 555 damage you shouldn't use a potion that heals for 2,399 health, that would simply be wastful, using the right potion for the right circumstance is important."));
        tips.add(new Tip("Fishing", "Use the Nasty Lure trinket for going fishing. It will increase the amount of fishes by 40%."));
        tips.add(new Tip("Seeding", "If you start seeding your own Components then you can speed up the growth by throwing a Waterbomb on it. It will grow instantly! You can also use Harvest Bombs to instantly farm your grown Components. If you put Potted Plants nearby, it will also be affected by the Waterbomb and instantly grows."));
        tips.add(new Tip("Sleeping", "A few creatures in Crashlands only appear by night. Use the Stone Bed to speed up day and night cycle. You can also make other Beds from more advanced Workstation."));
        tips.add(new Tip("Creature Eggs", "You can get creatures egg from the creature between the medium and the large size ONLY. The smallest creature of a species does not drop an egg. Forget about slaying 1000 wompits to get its egg. Kill the heifer wompit and the bull wompit ones."));
        tips.add(new Tip("Health", "Wear an armor that has the Vampire Buff. It can replenish your health while you attacking your enemies.\n" +
                "\n" +
                "Defeat the Baconweed Fairy to get the Baconband. It can replenish your health by 0.25% every second. You can get this questline from Ugy's Meadow. Talk to the Tendraam there.\n" +
                "\n" +
                "Get an Excellent Grade armor piece. It gave you the most health among other Grades beside Legendary."));
    }
}
