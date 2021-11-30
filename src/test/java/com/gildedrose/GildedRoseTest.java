package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void shouldUpdateQualityOfItem() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void shouldUpdateAgedBrieQualityByOne() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void shouldUpdateBackstageQualityByThreeIfSellsIsLessThanElevenButNotNegativeAndQualityIsLessThan50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZeroAndQualityIsLessThan50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void shouldUpdateBackstageQualityByTwoIfSellsIsBetweenSixAndElevenAndQualityIsLessThan50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void shouldNotUpdateBackstageQualityIfQualityIsGreaterThanOrEqualTo50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, app.items[0].quality);
    }

}
