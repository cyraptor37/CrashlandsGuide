package com.android.cyraptor.crashlandsguide;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TipAdapter extends RecyclerView.Adapter<TipAdapter.TipViewHolder>{

    public static class TipViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView tipName;
        TextView tipDescription;

        TipViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            tipName = (TextView)itemView.findViewById(R.id.tip_name);
            tipDescription = (TextView)itemView.findViewById(R.id.tip_description);
        }
    }

    List<Tip> tips;

    TipAdapter(List<Tip> tips){
        this.tips = tips;
    }

    @Override
    public int getItemCount() {
        return tips.size();
    }

    @Override
    public TipViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tip, viewGroup, false);
        TipViewHolder tvh = new TipViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(TipViewHolder tipViewHolder, int i) {
        tipViewHolder.tipName.setText(tips.get(i).name);
        tipViewHolder.tipDescription.setText(tips.get(i).description);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}