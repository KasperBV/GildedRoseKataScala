package com.gildedrose

import org.scalatest.{BeforeAndAfter, FunSuite}

abstract class GildedRoseTest  extends FunSuite with BeforeAndAfter {

  def assertItem(item:Item, quality:Integer, sellIn:Integer): Unit = {
    assert(item.quality == quality)
    assert(item.sellIn == sellIn)
  }

}