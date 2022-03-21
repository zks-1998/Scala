package com.gzhu.simple

class Red{
  def sayWho()={
    println("Red Red Red")
  }
}

class Green{

}

object ImplicitTest {

  implicit def greenToRed(green: Green):Red = {  // 隐式函数
    new Red
  }

  def main(args: Array[String]): Unit = {
    val green = new Green
    green.sayWho()
  }

}
