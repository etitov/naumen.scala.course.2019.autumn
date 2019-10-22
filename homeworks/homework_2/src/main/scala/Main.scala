object Main {
  def main(args: Array[String]): Unit = {
    val leftVec0 = Exercises.Vector2D(6, 5)
    val leftVec1 = Exercises.Vector2D(2, 4)
    val rightVec0 = Exercises.Vector2D(1, 2)
    val rightVec1 = Exercises.Vector2D(2, -3)
    print(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1))
  }
}
