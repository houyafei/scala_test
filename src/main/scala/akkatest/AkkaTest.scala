package akkatest

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akkatest.Calculator.{Add, Minus, Plus}


class Calculator() extends Actor {
  override def receive: Receive = {
    case Plus(a, b) => println(a * b)
    case Minus(a, b) => println(a - b)
    case Add(a, b) => println(a + b)

  }
}

object Calculator {

  def prob: Props = Props[Calculator]

  case class Add(a: Int, b: Int)

  case class Minus(a: Int, b: Int)

  case class Plus(a: Int, b: Int)

}

object AkkaTest {

  def main(args: Array[String]): Unit = {

    val system: ActorSystem = ActorSystem("myCalculator")

    val cal: ActorRef = system.actorOf(Calculator.prob, "ddd")

    cal ! Plus(1, 9)

    cal ! Minus(1, 9)

    cal ! Add(1, 9)
  }

}