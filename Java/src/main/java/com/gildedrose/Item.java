package com.gildedrose;

public class Item {

    private final String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public MarketItem toMarketItem() {
        if (AgedBrie.NAME.equals(this.name)) {
            return new AgedBrie(this);
        } else if (BackstagePass.NAME.equals(this.name)) {
            return new BackstagePass(this);
        } else if (Sulfuras.NAME.equals(this.name)) {
            return new Sulfuras(this);
        } else {
            return new GeneralItem(this);
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void increaseQuality() {
        this.quality = this.quality + 1;
    }

    public void decreaseQuality() {
        this.quality = this.quality - 1;
    }

    public void decreaseSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    public boolean qualityIsLowerThan(int i) {
        return this.quality < i;
    }

    public boolean qualityIsGreaterThan(int i) {
        return this.quality > i;
    }

    public boolean sellInIsBelow(int i) {
        return this.sellIn < i;
    }

    public void setQualityToZero() {
        this.quality = 0;
    }
}
