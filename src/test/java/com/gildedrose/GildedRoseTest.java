package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



// Item -- interface { update }
// always-------
// new AgeBrie()
// new BackStagePasses()
// new OtherItem()

class GildedRoseTest {

    public static final String FOO_ITEM = "foo";
    public static final String AGED_BRIE_ITEM = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS_ITEM = "Sulfuras, Hand of Ragnaros";

    @Test
    void shouldUpdateQualityOfItemIfQualityIsGreaterThanZero() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(FOO_ITEM, 0, 10) );
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQualityOfItemIfQualityIsGreaterThanZeroAndSellInIsNegative() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(FOO_ITEM, -1, 10));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateAgedBrieQualityByOne() {
        List<Item> items = new ArrayList<>(); ;;
        items.add(new AgedBrie(AGED_BRIE_ITEM, 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByThreeIfSellsIsLessThanElevenButNotNegativeAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM, 2, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZeroAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM, 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateBackstageQualityByTwoIfSellsIsBetweenSixAndElevenAndQualityIsLessThan50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM, 6, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items.get(0).quality);

        assertThat(2, Is.is(quality));
    }

    @Test
    void shouldUpdateBackstageQualityByZeroIfSellsIsZero() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM, 0, 40));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items.get(0).quality);
    }

    @Test
    void shouldNotUpdateBackstageQualityIfQualityIsGreaterThanOrEqualTo50() {
        List<Item> items = new ArrayList<>();
        items.add(new BackStagePasses(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT_ITEM, 1, 60));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, app.items.get(0).quality);
    }

    @Test
    void shouldNotUpdateSulfurassQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Sulfras(SULFURAS_HAND_OF_RAGNAROS_ITEM, 1, 60));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, app.items.get(0).quality);
    }



}
