package com.gzhu.simple

import scala.util.control.Breaks.break

object Circle {
  def main(args: Array[String]): Unit = {


    for(num <- 1 to 10){ // 1到10，包括10
      print(num+"-");
    }
    println()

    for(num <- 1 until(10,2)){  // 10到9，步长为2
      print(num+"-")
    }
    println()

    for(num <- 1 to 10 ; if(num % 2 == 0) ; if(num > 5)){ // 可以加判断条件
      print(num+"-")
    }
    println()

    // 局部变量
    var a = 1
    // do 循环
    do {
      print("Value of a: " + a +"-")
      a = a + 1
    } while ( {
      a < 3
    })


  }
}
