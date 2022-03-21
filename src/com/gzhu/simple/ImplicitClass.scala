package com.gzhu.simple



class Dog{

}
object ImplicitClass {
  implicit class Animall(dog: Dog){
    def sayName(): Unit ={
      println("dog隐式类...")
    }
  }

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.sayName    // 创建了一个dog对象
  }
}
