package com.gildedrose

class SulfurasTest extends GildedRoseTest {

  test ("Nothing happens Test") {
    val items = Array[Item](
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", 5, 80)
    )
    val app = new GildedRose(items)
    assertItem(app.items(0), 80 , 0)
    assertItem(app.items(1), 80 , 5)

  }

}
