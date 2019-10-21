import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
      assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
      intercept[IllegalArgumentException] {
        Exercises.sumOfDivBy3Or5(20, 10)
      }
    }

    'test_primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
      assert(Exercises.primeFactor(10817521) == Seq(11, 13, 23))
      intercept[IllegalArgumentException] {
        Exercises.primeFactor(-5)
      }
    }

    'test_sumScalars - {
      assert(Exercises.sumScalars(new Exercises.Vector2D(0, 1), new Exercises.Vector2D(1, 1), new Exercises.Vector2D(-1, -1), new Exercises.Vector2D(-2, -2))
        == 5)
      assert(Exercises.sumScalars(new Exercises.Vector2D(0, 1), new Exercises.Vector2D(1, 0), new Exercises.Vector2D(1, 1), new Exercises.Vector2D(1, -1))
        == 0)
    }

    'test_sumCosines - {
      val first = Exercises.sumCosines(new Exercises.Vector2D(0, 1), new Exercises.Vector2D(1, 1), new Exercises.Vector2D(-1, -1), new Exercises.Vector2D(-2, -2))
      assert(first > 1.707106 && first < 1.707107)

      val second = Exercises.sumCosines(new Exercises.Vector2D(0, 1), new Exercises.Vector2D(1, 0), new Exercises.Vector2D(1, 1), new Exercises.Vector2D(1, -1))
      assert(second == 0)
    }

    'test_sortByHeavyweight - {
      val sortedBalls: Seq[String] =
        Seq(
          "Tin", "Platinum", "Nickel", "Aluminum",
          "Titanium", "Lead", "Sodium", "Uranium",
          "Gold", "Tungsten", "Zirconium","Chrome",
          "Iron", "Copper", "Silver", "Plutonium",
          "Cobalt", "Cesium", "Calcium", "Lithium",
          "Magnesium", "Potassium", "Graphite",
        )
      assert(Exercises.sortByHeavyweight().sameElements(sortedBalls))
    }
  }
}
