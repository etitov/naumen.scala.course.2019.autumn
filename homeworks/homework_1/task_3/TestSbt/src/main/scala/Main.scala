object Main extends App {
  val a = " Scala! This is "
  val c = "Bonjuir "
  val b=" Viktor Zhukov"
  val e = "Hello"

  def reverse { println(c+a+b.reverse) }
  def helloScala { println(e+a+b) }
  def bonjuirScala { println(c+a+b) }

  helloScala
  bonjuirScala
  reverse
}