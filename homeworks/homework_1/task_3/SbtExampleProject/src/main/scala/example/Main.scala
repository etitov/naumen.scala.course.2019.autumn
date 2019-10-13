package example

object Main extends App {
  var name = "Alexander Nokhrin"
  var greetings = Array("Hello", "Привет", "Hola", "Wassup")
  println(s"${greetings(0)} Scala! This is $name")
  for (greeting <- greetings){
    println(s"$greeting Scala! This is $name")
    println(s"$greeting Scala! This is ${name.reverse}")
  }
}
