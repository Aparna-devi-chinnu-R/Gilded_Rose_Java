package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
            if(item.name.equals("Aged Brie") ){
                updateAgedBrie(item);
            }

            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                upgradeBackStage(item);
            }

            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }
                }
            }


            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality = item.quality - 1;
                            }
                        }
                    }
                }
            }
        }
    }

    private void upgradeBackStage(Item item) {
        if(item.quality < 50){
            item.quality++;

            if(item.sellIn < 11) item.quality++;
            if (item.sellIn < 6) item.quality ++;

            if(item.sellIn <= 0) item.quality = 0 ;
            item.sellIn --;
        }
    }

    private void updateAgedBrie(Item item) {
        if(item.quality < 50){
            item.sellIn --;
            item.quality ++;
        }
    }
}
