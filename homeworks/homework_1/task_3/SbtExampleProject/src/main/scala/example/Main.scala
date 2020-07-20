package example

object Main extends App {
  def greet(greeting: String, name: String): Unit = {
    printf("%s Scala! This is %s! \n", greeting, name);
  }

  var myName: String = "Sergey Biryukov";
  var reverseName: String = myName.reverse;
  val arrayOfGreetings = Array("Hello", "Guten tag", "こんにちは", "您好");

  for(greeting <- arrayOfGreetings) {
    greet(greeting, myName);
    greet(greeting, reverseName);
  }
}
