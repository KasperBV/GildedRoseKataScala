package com.gildedrose

import org.scalatest.{BeforeAndAfter, FunSuite}

class DefaultItemTest  extends GildedRoseTest {

  test ("Default quality degradation Test") {
    val items = Array[Item](
      new Item("bar", 5, 5),
      new Item("foo", 5, 0)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 4 , 4)
    assertItem(app.items(1), 0 , 4)
  }

  test ("Rapid quality degradation Test") {
    val items = Array[Item](
      new Item("foo", 0, 0),
      new Item("bar", -1, 4),
      new Item("foo", 0, 4)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 0 , -1)
    assertItem(app.items(1), 2 , -2)
    assertItem(app.items(2), 2 , -1)
  }


}
