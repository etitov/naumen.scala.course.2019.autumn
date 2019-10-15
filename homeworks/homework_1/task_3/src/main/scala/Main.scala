object Main extends App {
  val name = "Arseny Antsiferov"
  val rname = name.reverse
  val list = List("Hello", "Hola", "Guten tag")
  for (i <- 0 until list.length){
    println(s"${list(i)} Scala! This is $name");
  }
  for (i <- 0 until list.length){
    println(s"${list(i)} Scala! This is $rname");
  }
}
