class Person {

  var name:String =""

  var age:Int = 0

  val idCode:Int = 909090
}

object test{
  def main(args: Array[String]): Unit = {
    val per:Person = new Person
    per.name = "ok"
    println(per.name)
    per.name_=("better")
    println(per.name)
  }
}
