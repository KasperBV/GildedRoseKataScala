package com.gildedrose
import com.gildedrose.qualityUpdater.InventoryQualityUpdater

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    for (i <- 0 until items.length) {
      InventoryQualityUpdater.updateQuality(items(i))
    }
  }
}