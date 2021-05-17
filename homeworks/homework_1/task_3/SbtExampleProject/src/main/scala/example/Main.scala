package example

object Main extends App {
  val hellos = Array("Hello", "Hola", "Guten tag")
  val textTpl = (hello: String, name: String) => s"$hello Scala! This is $name"
  val name = "Kirill Elizarov"
  val greet = (hellos: Array[String], name: String) => hellos.map(h=>println(textTpl(h,name)))
  greet(hellos, name)
  greet(hellos, name.reverse)
}
