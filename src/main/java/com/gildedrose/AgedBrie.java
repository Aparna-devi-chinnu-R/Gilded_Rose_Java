package com.gildedrose;

public class AgedBrie extends Item {


    public static final int QUALITY_LIMIT = 50;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    Item update() {
        if (isQualityLessThanQualityLimit()) {
            sellIn--;
            quality++;
        }
        return this;
    }

    private boolean isQualityLessThanQualityLimit() {
        return quality < QUALITY_LIMIT;
    }
}
