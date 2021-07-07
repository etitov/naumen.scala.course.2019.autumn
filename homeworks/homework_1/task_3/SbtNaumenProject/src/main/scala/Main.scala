object Main extends App{
  def printHelloScala(hello: String, myName: String): Unit = println(f"$hello%s Scala! This is $myName%s")

  var helloTranslations = Array("Hello", "Hola", "Guten Tag");
  val myName = "Dmitry Kopylov"
  var myNames = Array(myName, myName.reverse);

  myNames.foreach{ myName=>
    helloTranslations.foreach { helloText =>
      printHelloScala(helloText, myName)
    }
  }
}
