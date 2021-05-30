package com.gildedrose.qualityUpdater

import com.gildedrose.Item

trait ItemQualityUpdater {

  val MAX_QUALITY: Integer = 50

  def canUpdate(item: Item) : Boolean;

  def updateItem(item: Item): Unit = {
    updateQuality(item)
    updateSellIn(item)
  }

  protected def updateQuality(item: Item);

  protected def updateSellIn(item: Item): Unit = {
    item.sellIn -= 1
  }


  protected def isSellDatePast(item: Item) : Boolean =  item.sellIn < 1

  protected def degradeQuality(item: Item, degradingAmount: Integer)  =  {
    if (item.quality - degradingAmount  >= 0) {
      item.quality -= degradingAmount
    } else {
      item.quality = 0;
    }
  }

  protected def enhanceQuality(item: Item, enhancingAmount: Integer) = {
    if (item.quality + enhancingAmount  <= MAX_QUALITY) {
      item.quality += enhancingAmount
    } else {
      item.quality = MAX_QUALITY;
    }
  }



}
