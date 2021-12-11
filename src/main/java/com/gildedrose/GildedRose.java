package com.gildedrose;

// Try building this entire solution without if else conditions
// Likely no public fields; no gettters and setters

import java.util.List;

class GildedRose {
    List<Item> items; // List

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        items.forEach(item -> {
            if (item.isAgedBrie()) { // can we remove if else conditions;
                item.updateAgedBrie();
            } else if (item.isBackStagePasses()) { // breaking encapsulation
                item.upgradeBackStage();
            } else {
                if (!item.isSulfuras()) {
                    item.upgradeOther();
                }
            }
        });
    }



}
