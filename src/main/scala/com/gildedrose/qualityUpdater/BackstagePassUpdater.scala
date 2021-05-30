package com.gildedrose.qualityUpdater

import com.gildedrose.Item

object BackstagePassUpdater extends ItemQualityUpdater {

  override def updateQuality(item: Item): Unit = {
    if (isSellDatePast(item)) {
      item.quality = 0
    } else if (item.sellIn <= 5){
      enhanceQuality(item, 3)
    } else if (item.sellIn <= 10){
      enhanceQuality(item, 2)
    } else {
      enhanceQuality(item, 1)
    }
  }

  override def canUpdate(item: Item): Boolean = item.name.startsWith("Backstage passes");

}