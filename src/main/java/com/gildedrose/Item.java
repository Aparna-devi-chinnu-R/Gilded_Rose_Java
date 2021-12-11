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
     Item upgradeOther() {
        if (isParameterOneGreaterThanParameterTwo(this.quality, 0)) this.quality--;
        if (isParameterOneLesThanParameterTwo(this.sellIn, 0) && isParameterOneGreaterThanParameterTwo(this.quality, 0))
            this.quality--;

        return this;

    }

    Item upgradeBackStage() { // see if this parameter can be removed
        if (isParameterOneLesThanParameterTwo(this.quality, 50)) {
            this.quality++;

            if (isParameterOneLesThanParameterTwo(this.sellIn, 11)) this.quality++;
            if (isParameterOneLesThanParameterTwo(this.sellIn, 6)) this.quality++;

            if (isParameterOneIsLessThanOrEqualToParameterTwo(this.sellIn, 0)) this.quality = 0;
            this.sellIn--;
        }
        return this;
    }

    // get rid of statics; static dont have any place in OOPS
    Item updateAgedBrie() {
        if (isParameterOneLesThanParameterTwo(this.quality, 50)) {
            this.sellIn--;
            this.quality++;
        }
        return this;
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

    public boolean isAgedBrie() {
        return this.name.equals("Aged Brie");
    }

    public boolean isBackStagePasses() {
        return this.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    public boolean isSulfuras() {
        return this.name.equals("Sulfuras, Hand of Ragnaros");
    }
}
