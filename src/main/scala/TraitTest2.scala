object TraitTest2 {

  def main(args: Array[String]): Unit = {
    val money: Money = new Money() with ConsoleDateLog with ConsoleDateAuthorLog
    money.felling(100)
    val money1: Money = new Money() with ConsoleDateAuthorLog with ConsoleDateLog
    money1.felling(100)
  }

}

trait ConsoleLog {
  def log(msg: String) = println(msg)
}

trait ConsoleDateLog extends ConsoleLog {
  override def log(msg: String): Unit = {
    super.log(java.time.Instant.now().toString + ": " + msg)
  }
}

trait ConsoleDateAuthorLog extends ConsoleDateLog {
  override def log(msg: String): Unit = super.log("author : houyafei \n" + msg)
}

class Money extends ConsoleLog {
  def felling(value: Int) = {
    value match {
      case 10 => log("RMB : 10 ,it is good")
      case 20 => log("RMB : 20, ok")
      case 50 => log("RMB : better than before")
      case 100 => log("RMB 100, so perfect")
      case _ => log(_)
    }
  }
}


