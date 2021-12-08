package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    // name every condtion
    static void upgradeOther(Item item) {
        if (isParameterOneGreaterThanParameterTwo(item.quality, 0)) item.quality--;
        if (isParameterOneLesThanParameterTwo(item.sellIn, 0) && isParameterOneGreaterThanParameterTwo(item.quality, 0))
            item.quality--;

    }

    static void upgradeBackStage(Item item) { // see if this parameter can be removed
        if (isParameterOneLesThanParameterTwo(item.quality, 50)) {
            item.quality++;

            if (isParameterOneLesThanParameterTwo(item.sellIn, 11)) item.quality++;
            if (isParameterOneLesThanParameterTwo(item.sellIn, 6)) item.quality++;

            if (isParameterOneIsLessThanOrEqualToParameterTwo(item.sellIn, 0)) item.quality = 0;
            item.sellIn--;
        }
    }

    // get rid of statics; static dont have any place in OOPS
    static void updateAgedBrie(Item item) {
        if (isParameterOneLesThanParameterTwo(item.quality, 50)) {
            item.sellIn--;
            item.quality++;
        }
    }

    private static boolean isParameterOneLesThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn < givenNumber;
    }

    private static boolean isParameterOneGreaterThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn > givenNumber;
    }

    private static boolean isParameterOneIsLessThanOrEqualToParameterTwo(int sellIn,int givenNumber) {
        return sellIn <= givenNumber;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
