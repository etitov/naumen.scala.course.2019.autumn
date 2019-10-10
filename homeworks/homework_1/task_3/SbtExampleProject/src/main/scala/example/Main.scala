package example

object Main extends App {

  val greetWords = List("Hello", "Hola", "Guten tag")
  val reverseName = "Nizovtsev Ilya".reverse

  def greetings(greetWord: String = greetWords(0), name: String = "Nizovtsev Ilya"): Unit = println(s"$greetWord Scala! This is $name")

  greetings()
  greetings(greetWord = greetWords(1))
  greetings(greetWord = greetWords(2))
  greetings(name = reverseName)
  greetings(greetWords(1), reverseName)
  greetings(greetWords(2), reverseName)
}