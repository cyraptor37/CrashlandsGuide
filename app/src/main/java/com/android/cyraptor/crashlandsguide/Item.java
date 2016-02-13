package com.android.cyraptor.crashlandsguide;

public class Item {
    int image;
    String name;
    String description;
    String type;
    String level;
    String tier;
    String quality;
    String schematic;
    String comp1;
    int comp1Amt;
    String comp2;
    int comp2Amt;
    String comp3;
    int comp3Amt;
    String comp4;
    int comp4Amt;

    public Item(int image, String name, String description, String type, String level, String tier, String quality, String schematic, String comp1, int comp1Amt, String comp2, int comp2Amt, String comp3, int comp3Amt, String comp4, int comp4Amt) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.type = type;
        this.level = level;
        this.tier = tier;
        this.quality = quality;
        this.schematic = schematic;
        this.comp1 = comp1;
        this.comp1Amt = comp1Amt;
        this.comp2 = comp2;
        this.comp2Amt = comp2Amt;
        this.comp3 = comp3;
        this.comp3Amt = comp3Amt;
        this.comp4 = comp4;
        this.comp4Amt = comp4Amt;
    }

    public int getImage() {

        return image;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }

    public String getTier() {
        return tier;
    }

    public String getQuality() {
        return quality;
    }

    public String getSchematic() {
        return schematic;
    }

    public String getComp1() {
        return comp1;
    }

    public int getComp1Amt() {
        return comp1Amt;
    }

    public String getComp2() {
        return comp2;
    }

    public int getComp2Amt() {
        return comp2Amt;
    }

    public String getComp3() {
        return comp3;
    }

    public int getComp3Amt() {
        return comp3Amt;
    }

    public String getComp4() {
        return comp4;
    }

    public int getComp4Amt() {
        return comp4Amt;
    }
}
