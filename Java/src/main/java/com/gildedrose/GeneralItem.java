package com.gildedrose;

public class GeneralItem extends MarketItem{

    public GeneralItem(Item item) {
        super(item);
    }

    @Override
    public void updateQualityAndSellIn() {
        if (item.qualityIsGreaterThan(0)) {
            item.decreaseQuality();
        }

        item.decreaseSellIn();

        if (item.sellInIsBelow(0)) {
            if (item.qualityIsGreaterThan(0)) {
                item.decreaseQuality();
            }
        }
    }
}
