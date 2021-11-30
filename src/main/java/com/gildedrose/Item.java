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

    static void upgradeOther(Item item) {
        if (item.quality > 0) item.quality--;
        if (item.sellIn < 0 && item.quality > 0) item.quality--;

    }

    static void upgradeSulfuras(Item item) {
        //does nothing
    }

    static void upgradeBackStage(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11) item.quality++;
            if (item.sellIn < 6) item.quality++;

            if (item.sellIn <= 0) item.quality = 0;
            item.sellIn--;
        }
    }

    static void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.sellIn--;
            item.quality++;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
