package com.gildedrose;

class GildedRose {
    Items items;

    public GildedRose(Item[] items) {
        this.items = new Items(items);
    }

    public void updateQuality() {
        this.items.updateQuality();
    }

}
