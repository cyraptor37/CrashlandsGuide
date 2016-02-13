package com.android.cyraptor.crashlandsguide;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView itemImage;
        TextView itemName;
        TextView itemType;
        TextView itemQuality;
        TextView itemDescription;

        ItemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
            itemType = (TextView) itemView.findViewById(R.id.item_type);
            itemQuality = (TextView) itemView.findViewById(R.id.item_quality);
            itemDescription = (TextView) itemView.findViewById(R.id.item_description);
        }
    }

    List<Item> items;

    ItemAdapter(List<Item> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        ItemViewHolder ivh = new ItemViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.itemImage.setImageResource(items.get(i).image);
        itemViewHolder.itemName.setText(items.get(i).name);
        itemViewHolder.itemType.setText(items.get(i).type);
        itemViewHolder.itemQuality.setText(items.get(i).quality);
        itemViewHolder.itemDescription.setText(items.get(i).description);

        Item item = items.get(i);
        if (item.getQuality().equals("Normal") || item.getQuality().equals("Random")) {
            itemViewHolder.itemName.setTextColor(Color.parseColor("#808080"));
        } else if (item.getQuality().equals("Good") ) {
            itemViewHolder.itemName.setTextColor(Color.parseColor("#00f427"));
        } else if (item.getQuality().equals("Superior")) {
            itemViewHolder.itemName.setTextColor(Color.parseColor("#7b87fa"));
        } else if (item.getQuality().equals("Epic")) {
            itemViewHolder.itemName.setTextColor(Color.parseColor("#b400e7"));
        } else {
            itemViewHolder.itemName.setTextColor(Color.parseColor("#f29800"));
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}