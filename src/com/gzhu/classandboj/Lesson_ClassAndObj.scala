package com.gzhu.classandboj

/**
 * 1.object相当于java的单例，定义全是静态的
 * 4.每一行后面的分号可以省略
 * 5.类中可以传参，但要指定类型，有了参数就有了构造，默认有set和get方法，只有var变量可以set
 */

class Person(xname:String,xage:Int){   // 类
  val name = xname;
  val age = xage;
  var gender = 'N';


  def sayName(): Unit ={ // 方法
    println("My name is - " + Lesson_ClassAndObj.name);
  }

  def this(xname:String,xage:Int,xgender:Char){  // 重载构造
    this(xname,xage);
    this.gender = xgender;
  }

}

class Person2(override val name:String, override val age:Int, val xaddress :String) extends Person(name,age){
    var address = xaddress;

    def sayAll():Unit = {
    print("name - "+ name+"- age - "+age+"- address - "+address);
  }
}


object Lesson_ClassAndObj {
  val name = "static test"

  def main(args: Array[String]): Unit = {  // 主函数
    val person = new Person("song", 24) // 对象
    println(person.name); // get方法
    println(person.age);


    person.sayName() // 调用方法

    val person1 = new Person("kun", 28, 'M');
    println(person1.gender);

    val person2 = new Person2("zhang", 16, "guangzhou") // 继承的类
    person2.sayName() // 调用父类的方法
    println(person2.sayAll())
  }
}
