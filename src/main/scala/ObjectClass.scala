class ObjectClass {
  val manager: String = "Houyafei"

  private def getManager:String={
    manager
  }

  //using the object class private field
  override def toString: String = {
    s"name = ${ObjectClass.name} , age = ${ObjectClass.age}, manager = $manager ,id = ${ObjectClass.id}"
  }
}


object ObjectClass {
  //using the class private method
  var name = new ObjectClass().getManager
  var age = 0
  private val id: Int = 9898

}


object test2 {
  def main(args: Array[String]): Unit = {
    ObjectClass.age_=(26)
    println(ObjectClass.age)
    println(ObjectClass.name)
  }
}
