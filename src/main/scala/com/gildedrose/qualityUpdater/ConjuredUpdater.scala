package com.gildedrose.qualityUpdater

import com.gildedrose.Item

object ConjuredUpdater extends ItemQualityUpdater {

  override def updateQuality(item: Item): Unit = {
    if (isSellDatePast(item)) {
      degradeQuality(item, 4)
    } else {
      degradeQuality(item, 2)
    }
  }

  override def canUpdate(item: Item): Boolean = item.name.startsWith("Conjured")

}