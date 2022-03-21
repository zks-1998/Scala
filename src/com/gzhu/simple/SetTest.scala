package com.gzhu.simple

import scala.collection.mutable

object SetTest {
  def main(args: Array[String]): Unit = {
    val set = Set[Int](1,2,2,2,3,4,5)
    val set1 = Set[Int](4,5)

    set.foreach((num)=>print(num+" "))  // set有去重功能
    println()

    val ints = set.intersect(set1) // 集合差集 也可以 set & set1
    val ints1 = set.diff(set1) // 差集

    val set2 = mutable.Set[Int](1,2,3)  // 可变set
    set2.+=(4)
    set2.foreach((num) =>{print(num+" ")})
  }
}
