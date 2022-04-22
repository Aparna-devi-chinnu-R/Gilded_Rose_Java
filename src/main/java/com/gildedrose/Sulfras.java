package com.gildedrose;

// THE JOB OF THIS CLASS S - we dont know ?
public class Sulfras extends Item{
    public Sulfras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    Item update() {
      return this;
    }
}
