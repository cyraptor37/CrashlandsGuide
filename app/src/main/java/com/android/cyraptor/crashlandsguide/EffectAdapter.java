package com.android.cyraptor.crashlandsguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EffectAdapter extends RecyclerView.Adapter<EffectAdapter.EffectViewHolder> implements FastScrollRecyclerView.SectionedAdapter {
    List<Effect> effects;

    public static class EffectViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView effectName;
        TextView effectDescription;

        EffectViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            effectName = (TextView)itemView.findViewById(R.id.effect_name);
            effectDescription = (TextView)itemView.findViewById(R.id.effect_description);
        }
    }

    EffectAdapter(List<Effect> effects){
        this.effects = effects;
    }

    @Override
    public int getItemCount() {
        return effects.size();
    }

    @Override
    public EffectViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.effect, viewGroup, false);
        EffectViewHolder evh = new EffectViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(EffectViewHolder effectViewHolder, int i) {
        effectViewHolder.effectName.setText(effects.get(i).name);
        effectViewHolder.effectDescription.setText(effects.get(i).description);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @NonNull
    @Override
    public String getSectionName(int position) {
        return String.valueOf(position);
    }

    public EffectAdapter() {
        super();

        effects = new ArrayList<>();
        effects.add(new Effect("A Chance", "TEST A"));
        effects.add(new Effect("B Chance", "TEST B"));
        effects.add(new Effect("C Chance", "TEST C"));
        effects.add(new Effect("D Chance", "TEST A"));
        effects.add(new Effect("E Chance", "TEST B"));
        effects.add(new Effect("F Chance", "TEST C"));
        effects.add(new Effect("G Chance", "TEST A"));
        effects.add(new Effect("H Chance", "TEST B"));
        effects.add(new Effect("I Chance", "TEST C"));
        effects.add(new Effect("J Chance", "TEST A"));
        effects.add(new Effect("K Chance", "TEST B"));
        effects.add(new Effect("L Chance", "TEST C"));
        effects.add(new Effect("M Chance", "TEST A"));
        effects.add(new Effect("N Chance", "TEST B"));
        effects.add(new Effect("O Chance", "TEST C"));
    }
}