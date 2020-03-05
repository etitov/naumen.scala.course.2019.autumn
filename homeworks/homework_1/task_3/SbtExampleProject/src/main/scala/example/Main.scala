package example

object Main extends App {
  var name = "Ilya"
  var hello = "Hello Scala! This is"

  val all_hello = Array(
    hello,
    hello.split(" ").map(x => if (x == "Hello") "Hi" else x).mkString(" "),
    hello.split(" ").map(x => if (x == "Hello") "Bye bye" else x).mkString(" ")
  )

  Console.println(all_hello(0) + " " + name)
  Console.println(all_hello(1) + " " + name)
  Console.println(all_hello(2) + " " + name)

  name = name.reverse

  Console.println(all_hello(0) + " " + name)
  Console.println(all_hello(1) + " " + name)
  Console.println(all_hello(2) + " " + name)
}
