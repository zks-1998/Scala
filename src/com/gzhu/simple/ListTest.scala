package com.gzhu.simple

import java.util
import scala.collection.mutable.ListBuffer

object ListTest {
  def main(args: Array[String]): Unit = {
    val list = List[String]("hello_java","zhang_kun_song")

    list.foreach(s=>{print(s+" ")}) // 遍历集合
    println()
    println(list(0)) // 通过索引获取


    val list1 = list.map(s => { // 对集合中的每一个元素分割，得到的是泛型为数组的集合
      s.split("_")      // [hello,java] [zhang,kun,song]
    })
    list1.foreach(arr=>{arr.foreach(s=>{print(s+" ")});println()})

    val list2 = list.flatMap(s => {
      s.split("_") // [hello] [java] [zhang] [kun] [song]
    })
    list2.foreach(arr=>{print(arr + " ")})


    val list3 = ListBuffer[Int]() // 可变List
    list3.append(1,2,3)
    list3.foreach((num)=>{print(num+" ")})

  }
}
