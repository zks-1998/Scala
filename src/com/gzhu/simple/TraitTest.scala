package com.gzhu.simple




trait Audi{
  val name = "Audi"
  def runAudi(time:Int)={
    println(name+"running....."+time)
  }
}

trait Benz{
  val name1 = "Benz"
  def runBenz(time:Int)={  // 实现的方法
    println(name1+"running....."+time)
  }

  def recreate():String  // 未实现的方法
}

class Car extends Audi with Benz {
  override def recreate(): String = {
    "recreate.."
  }
}

object TraitTest {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.runBenz(10)
    car.runAudi(20)
  }

}
