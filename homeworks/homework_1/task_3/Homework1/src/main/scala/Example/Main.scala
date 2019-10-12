package Example

object Main extends App {
  val greetings = List("Hello", "Hallo", "Bonjour")
  val myName = "Obukhov Anatoly"
  val reverseName = myName.reverse
  def greet(greeting: String=greetings(0), name: String = myName) = println(s"$greeting Scala! This is $name")
  greet()
  greet(greetings(1))
  greet(greetings(2))
  greet(name=reverseName)
  greet(greetings(1), reverseName)
  greet(greetings(2), reverseName)
}
