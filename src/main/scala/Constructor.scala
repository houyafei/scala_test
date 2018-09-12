class Constructor (var age:Int) {

  println(age)

  def this(name:String,age:Int){
    this(age)
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val cons:Constructor = new Constructor(90)
    cons.age_=(26)
    println(cons.age)

    val cons2 = new Constructor("hyf",89)
    cons2.age_=(25)
    println(cons2.age)
  }
}