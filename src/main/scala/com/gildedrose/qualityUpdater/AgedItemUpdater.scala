package com.gildedrose.qualityUpdater

import com.gildedrose.Item

object AgedItemUpdater extends ItemQualityUpdater {

  override def updateQuality(item: Item): Unit = {
    if (isSellDatePast(item)) {
      enhanceQuality(item, 2)
    } else {
      enhanceQuality(item, 1)
    }
  }

  override def canUpdate(item: Item): Boolean = item.name.startsWith("Aged")

}