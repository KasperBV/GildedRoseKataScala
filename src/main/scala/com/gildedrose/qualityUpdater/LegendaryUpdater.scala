package com.gildedrose.qualityUpdater

import com.gildedrose.Item

object LegendaryUpdater extends ItemQualityUpdater {

  override def updateQuality(item: Item): Unit = {
  }

  override def canUpdate(item: Item): Boolean = item.name.startsWith("Sulfuras");

  override def updateSellIn(item: Item): Unit = {
  }

}