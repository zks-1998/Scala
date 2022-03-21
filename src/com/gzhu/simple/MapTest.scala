package com.gzhu.simple

import scala.collection.mutable
import scala.swing.event.Key

object MapTest {
  def main(args: Array[String]): Unit = {
    val map = Map[String,Int]("aa"->20,("b",30),("b",40));

    val value = map.get("aa").get // 获取value 20

    for(elem <- map){  // 遍历map
      println(elem)
    }

    map.foreach(kv=>{ // 遍历集合
      println(kv)
    })

    val keys = map.keys // 获取所有键值

    keys.foreach(key=>{  // 遍历key获取value
      val value1 = map.get(key).get
      println(s"key == $key,value = $value1")
    })

    val values = map.values // 获取所有value

    val map1 = Map[String,Int]("aa"->20,("b",30),("c",40));
    val map2 = Map[String,Int]("aa"->30,("b",40),("c",50));

    val map3 = map1.++(map2)   // map2替换map1
    val map4 = map1.++:(map2)  // map1替换map2

    val map5 = mutable.Map[String,Int]()  // 可变map
    map5.put("song",24)

  }
}
