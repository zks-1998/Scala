package com.gzhu.simple

object TupleTest {
  def main(args: Array[String]): Unit = {
    // 元组可以存不同类型的元素
    val tuple = new Tuple1("zhang")
    val tuple2 = new Tuple2("zhang",'C')
    val tuple4 = new Tuple4("zhang", false, 'C', 16)

    val value = tuple2._1 // ._xx取值
    println(value)

    val value1 = tuple4._4
    println(value1)

    val iterator = tuple4.productIterator  // 遍历，只能先拿到迭代器
    iterator.foreach(value=>{println(value)})

  }
}
