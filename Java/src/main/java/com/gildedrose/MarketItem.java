package com.gildedrose;

public abstract class MarketItem {

    Item item;

    MarketItem(Item item) {
        this.item = item;
    }

    public abstract void updateQualityAndSellIn();
}
