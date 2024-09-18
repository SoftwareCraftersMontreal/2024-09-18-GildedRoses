package com.gildedrose;

import java.util.Arrays;
import java.util.List;

public class Items{

    List<MarketItem> items;

    Items(Item[] items) {
        this.items = Arrays.stream(items).map(Item::toMarketItem).toList();
    }

    public void updateQuality() {
        items.forEach(MarketItem::updateQualityAndSellIn);
    }
}
