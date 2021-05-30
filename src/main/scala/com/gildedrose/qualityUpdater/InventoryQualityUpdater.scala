package com.gildedrose.qualityUpdater

import com.gildedrose.Item

object InventoryQualityUpdater {

  private val itemQualityUpdaters = List[ItemQualityUpdater](
    LegendaryUpdater,
    AgedItemUpdater,
    BackstagePassUpdater,
    ConjuredUpdater,
    BackstagePassUpdater,
    StandardUpdater
  )

  def updateQuality(item : Item): Unit = {
    for (updater <- itemQualityUpdaters)(
      if (updater.canUpdate(item)) {
        updater.updateItem(item);
        return
      }
    )
  }

}
