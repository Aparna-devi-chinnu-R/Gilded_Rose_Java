package com.gildedrose;

public class Item {

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
        if (isParameterOneGreaterThanParameterTwo(quality, 0)) quality--;
        if (isParameterOneLesThanParameterTwo(sellIn, 0) && isParameterOneGreaterThanParameterTwo(quality, 0))
            quality--;

        return this;
    }

    private static boolean isParameterOneGreaterThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn > givenNumber;
    }

    private static boolean isParameterOneLesThanParameterTwo(int sellIn, int givenNumber) {
        return sellIn < givenNumber;
    }


}
