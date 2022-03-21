package com.gzhu.simple

object MatchTest {
  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
    println("偏函数"+myTest("ooo"))

  }
  def matchTest(x: Any) = x match {
    case 1 => "one"
    case "two" => 2
    case y :Int => "scala.Int"
    case _ => "no match" // case _ 什么都不匹配,类似 switch 中的 default
  }

  def myTest:PartialFunction[String,Int] = {  // 偏函数相比match没有match了，匹配String，返回Int
    case "abc" => 22
    case "bcd" => 66
    case _ => 84
  }
}
