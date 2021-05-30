package com.gildedrose

class BackstagePassesTest extends GildedRoseTest {

  test ("Default quality enhancement Test") {
    val items = Array[Item](
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 4),
      new Item("Backstage passes to a TAFKAL80ETC concert", 11, 4)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 5 , 14)
    assertItem(app.items(1), 5 , 10)
  }

  test ("Double quality enhancement Test") {
    val items = Array[Item](
      new Item("Backstage passes to a TAFKAL80ETC concert", 6, 4),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 4),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 4)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 6 , 5)
    assertItem(app.items(1), 6 , 8)
    assertItem(app.items(2), 6 , 9)
  }

  test ("Triple quality enhancement Test") {
    val items = Array[Item](

      new Item("Backstage passes to a TAFKAL80ETC concert", 4, 4),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4),

    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 7 , 3)
    assertItem(app.items(1), 7 , 4)
  }

  test ("Max Quality Limit Test") {
    val items = Array[Item](
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 48),
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49),
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 49),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 50, 2)
    assertItem(app.items(1), 50, 2)
    assertItem(app.items(2), 50, 2)
    assertItem(app.items(3), 50, 14)
    assertItem(app.items(4), 50, 8)
    assertItem(app.items(5), 50, 8)
  }

  test ("Worthless after event Test") {
    val items = Array[Item](
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 4),
      new Item("Backstage passes to a TAFKAL80ETC concert", -1, 4)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    assertItem(app.items(0), 0, -1)
    assertItem(app.items(1), 0, -2)
  }



}
