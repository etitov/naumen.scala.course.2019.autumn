package example

object Main extends App {
    val hello_words = Array("Hello", "Hola", "Guten Tag");
    val text = " Scala! This is ";
    val name = "Andrey Shapovalov";
    val reversed_name = name.reverse;

    def show(hello_word: String, text: String, name: String) = println(s"$hello_word $text $name")

    for (element <- hello_words) show(element, text, name);
    for (element <- hello_words) show(element, text, reversed_name);
}