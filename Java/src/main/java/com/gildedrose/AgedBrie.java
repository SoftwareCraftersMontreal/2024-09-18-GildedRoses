package com.gildedrose;

public class AgedBrie extends MarketItem {
    public static final String NAME = "Aged Brie";

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQualityAndSellIn() {
        if (item.qualityIsLowerThan(30)) {
            item.increaseQuality();
        }

        item.decreaseSellIn();

        if (item.sellInIsBelow(0)) {
            if (item.qualityIsLowerThan(50)) {
                item.increaseQuality();
            }
        }
    }
}
