import utest._

object Test extends TestSuite {
  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
      assert(Exercises.sumOfDivBy3Or5(1, 100) == 2418)
      assert(Exercises.sumOfDivBy3Or5(1000, 5000) == 5601000)
      assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
      assert(Exercises.sumOfDivBy3Or5(0, 1) == 0)
    }
    'test_primeFactor - {
      assert(Exercises.primeFactor(80) == Seq(2, 5))
      assert(Exercises.primeFactor(60323) == Seq(179, 337))
      assert(Exercises.primeFactor(98) == Seq(2, 7))
    }
    'sumScalars - {
      val leftVec0 = Exercises.Vector2D(1, -1)
      val leftVec1 = Exercises.Vector2D(3, 2)
      val rightVec0 = Exercises.Vector2D(-7, 1)
      val rightVec1 = Exercises.Vector2D(1, -2)
      assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == -8.0)
    }
    'sumCosines - {
      val leftVec0 = Exercises.Vector2D(6, 5)
      val leftVec1 = Exercises.Vector2D(2, 4)
      val rightVec0 = Exercises.Vector2D(1, 2)
      val rightVec1 = Exercises.Vector2D(2, -3)
      assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 0.4200183965453553)
    }
    'sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(
        Map(
          "Gadolinium" -> (2, 7.9), "Iron" -> (2, 7.87), "Silver" -> (8, 10.5), "Titanium" -> (12, 4.54),
          "Silicon" -> (1, 2.33), "Krypton" -> (5, 3.75), "Zinc" -> (4, 7.13), "Cerium" -> (15, 6.77)))
        == Seq("Silicon", "Iron", "Gadolinium", "Zinc", "Krypton", "Silver", "Titanium", "Cerium"))
      assert(Exercises.sortByHeavyweight(
        Map(
          "Tin" -> (8, 7.29), "Platinum" -> (4, 21.45), "Nickel" -> (5, 8.91), "Plutonium" -> (3, 19.25),
          "Titanium" -> (2, 10.50), "Lead" -> (2, 11.336), "Silver" -> (9, 4.505), "Uranium" -> (12, 19.04),
          "Cesium" -> (3, 1.873), "Chrome" -> (1, 7.18), "Zirconium" -> (14, 6.45)))
        == Seq("Chrome", "Cesium", "Titanium", "Lead", "Plutonium", "Nickel", "Platinum", "Silver", "Tin", "Zirconium", "Uranium"))
    }
  }
}
