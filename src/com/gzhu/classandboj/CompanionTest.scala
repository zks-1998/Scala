package com.gzhu.classandboj

// 私有构造方法
class CompanionTest private(val color:String) {

  println("创建" + this)

  override def toString(): String = "颜色标记："+ color
}

// 伴生对象，与类名字相同，可以访问类的私有属性和方法
object CompanionTest{

  private val markers: Map[String, CompanionTest] = Map(
    "red" -> new CompanionTest("red"),
    "blue" -> new CompanionTest("blue"),
    "green" -> new CompanionTest("green")
  )

  def apply(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }


  def getMarker(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }
  def main(args: Array[String]) {
    println(CompanionTest("red"))  //CompanionTest无参数构造，会匹配apply方法
    // 单例函数调用，省略了.(点)符号
    println(CompanionTest.getMarker( "blue"))
  }
}