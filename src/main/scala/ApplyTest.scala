class Cat(val name: String, val color: String)

object Cat {

  def apply(name: String, color: String): Cat = new Cat(
    name,
    color
  )

  def unapply(arg: Cat): Option[(String, String)] = if (arg == null) None else Some(arg.name, arg.color)

}


object ApplyTest {

  def main(args: Array[String]): Unit = {
    val cat: Cat = Cat("kitty", "white")
    //    println(cat.isInstanceOf[Cat])
    println(cat)
    val cat02 = Cat("tom","black")
    println(cat02)
    cat match {
      case Cat(str, str1) => println(str + str1)
      case _ => println("none")
    }
  }

}
