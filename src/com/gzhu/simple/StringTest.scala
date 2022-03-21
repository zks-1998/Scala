package com.gzhu.simple

object StringTest {
  def main(args: Array[String]): Unit = {
    val s = "zhang"  // 普通字符串
    val s1 = "zhang1"

    val sb = new StringBuffer(); // 可变字符串
    sb.append(s).append("liu")

    println(sb)

    val i = s.compareTo(s1)  // compareTo
    println(i)

    println(s1.charAt(1)) // 索引

    val chars = s.toCharArray // 字符串转数组
    chars.foreach(c=>{print(c+" ")})

  }
}
