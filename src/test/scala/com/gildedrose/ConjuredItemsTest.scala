package com.gildedrose

class ConjuredItemsTest extends GildedRoseTest {

  test ("Default quality degradation Test") {
    val items = Array[Item](
      new Item("Conjured bar", 5, 5),
      new Item("Conjured foo", 5, 0)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 3 , 4)
    assertItem(app.items(1), 0 , 4)
  }

  test ("Rapid quality degradation Test") {
    val items = Array[Item](
      new Item("Conjured foo", 0, 0),
      new Item("Conjured bar", -1, 3),
      new Item("Conjured foo", 0, 3)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 0 , -1)
    assertItem(app.items(1), 0 , -2)
    assertItem(app.items(2), 0 , -1)
  }


}
