package example

object Main extends App {
  def print_greetings(name: String, reverse: Boolean, greetings: String*): Unit = {
    if (reverse)
      greetings.foreach(arg => println(s"$arg Scala! This is ${name.reverse}"))
    else
      greetings.foreach(arg => println(s"$arg Scala! This is $name"))
  }

  val name: String = "Eugen^^"
  print_greetings(name, false, "Hello")
  print_greetings(name, false, "Hi", "Aloha", "Syap")
  print_greetings(name, true, "Hi", "Aloha", "Syap")
}
