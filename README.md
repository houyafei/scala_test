# scala_test
scala学习中的一些demo代码

## 1、trait
内部可以包含抽象方法和属性，同样也可以包含非抽象方法和属性。但是，没有构造方法。

## 2、继承
extends关键字，继承抽象类、trait。继承父类中的方法和属性。

## 3、actor

- 工厂方式创建actor，这个工厂是：ActorSystem
- 创建方法是acctorOf（probs:Probs，name:String）:ActorRef
- 每个actor的创建，需要给一个伴生对象中添加一个产生Probs对象的方法
- 发送消息到actor中，使用 actor ！xxx 的格式

```
class Calculator extends Actor {
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
```

```
   val system: ActorSystem = ActorSystem("myCalculator")

   val cal: ActorRef = system.actorOf(Calculator.prob, "ddd")

```

```
//发送消息
    cal ! Plus(1, 9)

    cal ! Minus(1, 9)

    cal ! Add(1, 9)
```







