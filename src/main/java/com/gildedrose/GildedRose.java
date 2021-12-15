package com.gildedrose;

// Try building this entire solution without if else conditions
// Likely no public fields; no gettters and setters

import java.util.List;
import java.util.stream.Collectors;

class GildedRose {
    List<Item> items; // List

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public List<Item> updateQuality() {
        List<Item> updatedList = items.stream().map(item -> item.update()).collect(Collectors.toList());
        return updatedList;
    }



}
