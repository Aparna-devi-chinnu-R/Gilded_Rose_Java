package com.gildedrose;

public class BackStagePasses extends Item {

    public BackStagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    Item update() {
        if (isParameterOneLesThanParameterTwo(quality, 50)) {
            quality++;

            if (isParameterOneLesThanParameterTwo(sellIn, 11)) quality++;
            if (isParameterOneLesThanParameterTwo(sellIn, 6)) quality++;

            if (isParameterOneIsLessThanOrEqualToParameterTwo(sellIn, 0)) quality = 0;
            sellIn--;
        }
        return this;
    }

    private static boolean isParameterOneLesThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn < givenNumber;
    }

    private static boolean isParameterOneIsLessThanOrEqualToParameterTwo(int sellIn,int givenNumber) {
        return sellIn <= givenNumber;
    }
}
