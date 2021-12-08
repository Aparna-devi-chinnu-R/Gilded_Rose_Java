package com.gildedrose;

// Try building this entire solution without if else conditions
// Likely no public fields; no gettters and setters

class GildedRose {
    Item[] items; // List

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) { // :( better collections apis for java
            if (item.name.equals("Aged Brie")) { // can we remove if else conditions;
                Item.updateAgedBrie(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) { // breaking encapsulation
                Item.upgradeBackStage(item);
            } else {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    Item.upgradeOther(item);
                }
            }
        }
    }

}
