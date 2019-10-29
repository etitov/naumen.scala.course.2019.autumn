import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(0, 15) == 60)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'test_sumScalars - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(0, 1)
            val rightVec0 = Exercises.Vector2D(-1, 0)
            val rightVec1 = Exercises.Vector2D(2, 0)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == -2)
        }

        'test_sumCosines - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(0, 1)
            val rightVec0 = Exercises.Vector2D(-1, 0)
            val rightVec1 = Exercises.Vector2D(2, 0)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == -1)
        }

        'test_sortByHeavyweight - {
            val balls: Map[String, (Int, Double)] =
                Map(
                    "Tungsten" ->  (2,   19.35),
                    "Aluminum" -> (3,   2.6889),
                    "Nickel" ->   (2,   8.91),
                    "Iron" ->      (3,   7.874),
                    "Copper" ->    (3,   8.96),
                    "Silver" ->    (4,   4.505)
                )
            assert(Exercises.sortByHeavyweight(balls) == Seq("Nickel", "Aluminum", "Tungsten", "Iron", "Copper", "Silver"))
        }
    }
}
