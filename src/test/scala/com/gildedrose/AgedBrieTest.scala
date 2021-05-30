package com.gildedrose

class AgedBrieTest extends GildedRoseTest {

  test ("Default quality enhancement Test") {
    val items = Array[Item](
      new Item("Aged Brie", 5, 5),
      new Item("Aged Brie", 5, 0),
      new Item("Aged Brie", 5, 49),
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 6 , 4)
    assertItem(app.items(1), 1 , 4)
    assertItem(app.items(2), 50 , 4)
  }

  test ("Rapid quality enhancement Test") {
    val items = Array[Item](
      new Item("Aged Brie", 0, 0),
      new Item("Aged Brie", -1, 4),
      new Item("Aged Brie", 0, 4)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 2 , -1)
    assertItem(app.items(1), 6 , -2)
    assertItem(app.items(2), 6 , -1)
  }

  test ("Max Quality Limit Test") {
    val items = Array[Item](
      new Item("Aged Brie", 5, 50),
      new Item("Aged Brie", -3, 50)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 50, 4)
    assertItem(app.items(1), 50, -4)
  }

}
