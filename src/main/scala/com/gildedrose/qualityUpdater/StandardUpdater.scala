package com.gildedrose.qualityUpdater
import com.gildedrose.Item

object StandardUpdater extends ItemQualityUpdater {

  override def updateQuality(item: Item): Unit = {
    if (isSellDatePast(item)) {
      degradeQuality(item, 2)
    } else {
      degradeQuality(item, 1)
    }
  }

  override def canUpdate(item: Item): Boolean = true

}
