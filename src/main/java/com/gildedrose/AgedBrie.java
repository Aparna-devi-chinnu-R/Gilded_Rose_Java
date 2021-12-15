package com.gildedrose;

public class AgedBrie extends Item {


    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    Item update() {
        if (isParameterOneLesThanParameterTwo(quality, 50)) {
            sellIn--;
            quality++;
        }
        return this;
    }

    private static boolean isParameterOneLesThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn < givenNumber;
    }
}
