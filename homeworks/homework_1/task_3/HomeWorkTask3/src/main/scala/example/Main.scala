package example

object Main extends App{
  val name = "Pylaev Zhenja"
  val nameRev =name.reverse
  val list = List("Hello","Guten tag","Hola" )
  for (i <- 0 until list.length){
    println(s"${list(i)} Scala! This is $name");
  }
  for (i <- 0 until list.length){
    println(s"${list(i)} Scala! This is $nameRev");
  }


}
