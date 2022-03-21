package com.gzhu.simple

import java.util.Date

object Method {
  def main(args: Array[String]): Unit = {

   def fun(a:Int,b:Int)(c:Int,d:Int)={
     a+b+c+d
   }
    println(fun(1,2)(3,4))

  }
}
