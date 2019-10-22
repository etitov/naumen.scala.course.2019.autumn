import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2,5))
            assert(Exercises.primeFactor(454) == Seq(2, 227))
            assert(Exercises.primeFactor(98) == Seq(2,7))
        }
        'sumScalars - {
            val lVec0 = Exercises.Vector2D(1, 0)
            val lVec1 = Exercises.Vector2D(0, 1)
            val rVec0 = Exercises.Vector2D(-1, 0)
            val rVec1 = Exercises.Vector2D(2, 0)
            assert(Exercises.sumScalars(lVec0, lVec1, rVec0, rVec1) == -2)
        }
        'sumCosines - {
            val lVec0 = Exercises.Vector2D(4, 0)
            val lVec1 = Exercises.Vector2D(0, 5)
            val rVec0 = Exercises.Vector2D(-5, -1)
            val rVec1 = Exercises.Vector2D(6, -1)
            assert(Exercises.sumCosines(lVec0, lVec1, rVec0, rVec1) == -0.9349975263177835)
        }
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Iron" -> (2, 7.87), "Gadolinium" -> (2, 7.9), "Silver" -> (8, 10.5), "Titanium" -> (12, 4.54),
                    "Krypton" -> (5, 3.75), "Silicon" -> (1, 2.33), "Zinc" -> (4, 7.13), "Cerium" -> (15, 6.77)))
              == Seq("Silicon", "Iron", "Gadolinium", "Zinc", "Krypton", "Silver", "Titanium", "Cerium"))
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Nickel" ->   (5,   8.91),   "Tin" ->       (8,   7.29),  "Platinum" ->  (4,   21.45), "Plutonium" -> (3,   19.25),
                    "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (9,   4.505), "Uranium" ->   (12,   19.04),
                    "Chrome" ->   (1,   7.18),   "Cesium" ->    (3,   1.873), "Zirconium" -> (14,   6.45)))
              == Seq("Chrome", "Cesium", "Titanium", "Lead", "Plutonium", "Nickel", "Platinum", "Silver", "Tin", "Zirconium", "Uranium"))

        }
    }
}
