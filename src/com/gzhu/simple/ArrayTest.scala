package com.gzhu.simple

object ArrayTest {
  def main(args: Array[String]): Unit = {

    val array = Array[String]("ab","bc") // 直接赋值
    array.foreach(s=>{print(s + " ")})
    println()

    val array2 = new Array[Int](3) // 先声明再赋值
    array2(0) = 2
    array2(1) = 3
    array2(2) = 10
    array2.foreach(num=>{print(num + " ")}) // 遍历数组
    println()


    val array3 = new Array[Array[Int]](3) // 二维数组 三行
    array3(0) = Array[Int](1,2,3,8)
    array3(1) = Array[Int](1,6,2)
    array3(2) = Array[Int](8,12,9)

    array3.foreach(arr=>{arr.foreach(num=>{print(num+" ")});println()}) // 遍历二维数组


    var myList1 = Array(1.9, 2.9, 3.4, 3.5)  // 合并数组
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 =  Array.concat(myList1, myList2)
    // 输出所有数组元素
    for ( x <- myList3 ) {
      print( x + " ")
    }
    println()

    var myArr = Array.range(10,20)// 区间数组
    myArr.foreach(num=>{print(num+" ")})

  }
}
