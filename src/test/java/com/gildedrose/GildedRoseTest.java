package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void shouldUpdateQualityOfItemIfQualityIsGreaterThanZero() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("foo", 0, 10) );
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQualityOfItemIfQualityIsGreaterThanZeroAndSellInIsNegative() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("foo", -1, 10));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateAgedBrieQualityByOne() {
        List<Item> items = new ArrayList<>(); ;;
        items.add(new AgedBrie("Aged Brie", 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByThreeIfSellsIsLessThanElevenButNotNegativeAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 2, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZeroAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByTwoIfSellsIsBetweenSixAndElevenAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 6, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZero() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 0, 40));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items.get(0).quality);
    }

    @Test
    void shouldNotUpdateBackstageQualityIfQualityIsGreaterThanOrEqualTo50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 1, 60));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, app.items.get(0).quality);
    }

    @Test
    void shouldNotUpdateSulfurassQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Sulfras("Sulfuras, Hand of Ragnaros", 1, 60));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, app.items.get(0).quality);
    }



}
