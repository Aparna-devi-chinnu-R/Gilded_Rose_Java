package com.gildedrose;

public class Item {

    public static final int QUALITY_LIMIT = 0;
    protected String name;

    protected int sellIn;

    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    Item update(){
        if (isItemQualityGood()) quality--;

        if (isItemExpired() && isItemQualityGood())  quality--;

        return this;
    }

    private boolean isItemQualityGood() {
        return quality > QUALITY_LIMIT;
    }

    private boolean isItemExpired() {
        return sellIn < 0;
    }


}
