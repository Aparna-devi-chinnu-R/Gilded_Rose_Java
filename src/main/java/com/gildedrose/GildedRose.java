package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {

                updateAgedBrie(item);

            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

                upgradeBackStage(item);

            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

                upgradeSulfuras(item);

            } else {

                upgradeOther(item);

            }

        }
    }

    private void upgradeOther(Item item) {
        if (item.quality > 0) item.quality--;
        if (item.sellIn < 0 && item.quality > 0) item.quality--;

    }

    private void upgradeSulfuras(Item item) {
        //does nothing
    }

    private void upgradeBackStage(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11) item.quality++;
            if (item.sellIn < 6) item.quality++;

            if (item.sellIn <= 0) item.quality = 0;
            item.sellIn--;
        }
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.sellIn--;
            item.quality++;
        }
    }
}
