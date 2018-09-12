import java.util.Date

trait Iterator[A] {

  def hasNext: Boolean

  def next: A

}

trait CommonLog{
  def log(msg:String)=println(new Date().toString+":" +msg)
}

class IntIterator(to: Int) extends Iterator[Int] with CommonLog {

  private var current: Int = 0

  override def hasNext: Boolean = current < to

  override def next: Int = {
    if (hasNext) {
      current += 1
      log(current.toString)
      current
    } else 0
  }
}


object TraitTest {

  def main(args: Array[String]): Unit = {
    val iterator: IntIterator = new IntIterator(10)
    while (iterator.hasNext){
      iterator.next
    }
  }

}
