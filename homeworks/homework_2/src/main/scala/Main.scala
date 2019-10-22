object Main {
  def main(args: Array[String]): Unit = {
    print(Exercises.sortByHeavyweight(
      Map(
        "Gadolinium" -> (3, 4.1), "Iron" -> (8, 12), "Silver" -> (8, 11), "Titanium" -> (12, 4.32),
        "Silicon" -> (1, 3), "Krypton" -> (5, 12), "Zinc" -> (13, 7.13), "Cerium" -> (14, 6.1))))
  }
}
