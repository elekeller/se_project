@main def hello(): Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Yellow extends Color

sealed trait CardType
case class Point(value:Int) extends CardType
case class Draw2Card extends CardType
case class SkipCard extends CardType
case class ReverseCard extends CardType
case class WildCard extends CardType
case class WildDraw4Card extends CardType