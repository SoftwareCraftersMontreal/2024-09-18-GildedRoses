package com.gildedrose;

public class BackstagePass extends MarketItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void updateQualityAndSellIn() {
        if (item.qualityIsLowerThan(50)) {
            item.increaseQuality();

            if (item.sellInIsBelow(11)) {
                if (item.qualityIsLowerThan(50)) item.increaseQuality();
            }

            if (item.sellInIsBelow(6)) {
                if (item.qualityIsLowerThan(50)) item.increaseQuality();
            }
        }

        item.decreaseSellIn();

        if (item.sellInIsBelow(0)) {
            item.setQualityToZero();
        }
    }
}
