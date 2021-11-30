package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {

                Item.updateAgedBrie(item);

            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

                Item.upgradeBackStage(item);

            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

                Item.upgradeSulfuras(item);

            } else {

                Item.upgradeOther(item);

            }

        }
    }

}
