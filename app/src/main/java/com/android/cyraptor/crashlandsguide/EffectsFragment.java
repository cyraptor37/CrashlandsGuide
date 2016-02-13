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
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;

public class EffectsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_effects, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Status effects");

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.effects_recyclerview);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        EffectAdapter adapter = new EffectAdapter();
        rv.setAdapter(adapter);

        rv.setAdapter(new AlphaInAnimationAdapter(adapter));

        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(adapter);
        alphaAdapter.setDuration(550);
        rv.setAdapter(alphaAdapter);

        return view;
    }
}
