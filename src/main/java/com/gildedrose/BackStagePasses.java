package com.gildedrose;

public class BackStagePasses extends Item {

    public BackStagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    Item update() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11) quality++;
            if (sellIn < 6) quality++;

            if (sellIn <= 0) quality = 0;

            sellIn--;
        }

        return this;
    }

}
