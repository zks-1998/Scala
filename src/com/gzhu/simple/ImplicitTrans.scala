package com.gzhu.simple

object ImplicitTrans {
  def main(args: Array[String]): Unit = {
    implicit val name:String = "zhang"  // implicit声明隐式值

    def sayName(age:Int)(implicit name:String) ={
      println(s"$name is student... age = $age")
    }

    sayName(10)

  }
}
