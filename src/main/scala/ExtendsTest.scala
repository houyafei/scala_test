
class Point(val xc: Double, var yc: Double) {

  var x :Double = xc
  var y :Double = yc


  def move(dx: Double, dy: Double) = {
    x = x + dx
    y = y + dy
    println(s"x : $x , y : $y")
  }

  override def toString: String = s"x : $x , y : $y"

}

class Location(override val xc: Double,  var yy: Double, var zc: Double) extends Point(xc, yy) {

  var z :Double = zc

  def move(dx: Double, dy: Double, dz: Double) = {
    x = x + dx
    y = y + dy
    z += dz
    println(s"x : $x , y : $y , z : $z")
  }

  override def toString: String = s"x : $x , y : $y , z : $z"

}


object ExtendsTest {

  def main(args: Array[String]): Unit = {
    val point = new Point(10.2, 1.2)
    point.move(1, 3)
    val location = new Location(10.1, 10.2, 10.3)
    location.move(1, 1, 1)
    println(location)
    location.asInstanceOf[Point]
    println(location)
    location.asInstanceOf[Location]
    println(location)

  }

}
