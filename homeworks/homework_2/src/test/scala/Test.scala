import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
          assert(Exercises.sumOfDivBy3Or5(iFrom = 3, iTo = 15) == 60)
          assert(Exercises.sumOfDivBy3Or5(iFrom = 6, iTo = 10) == 25)
          assert(Exercises.sumOfDivBy3Or5(iFrom = 0, iTo = 7) == 14)
        }
        'test_primeFactor - {
         assert(Exercises.primeFactor(56) == Seq(2, 7))
         assert(Exercises.primeFactor(999) == Seq(3, 37))
          assert(Exercises.primeFactor(87) == Seq(3, 29))
        }
      'sumScalars - {
        val lVec0 = Exercises.Vector2D(2, 0)
        val lVec1 = Exercises.Vector2D(1, 0)
        val rVec0 = Exercises.Vector2D(1, 2)
        val rVec1 = Exercises.Vector2D(3, 0)
        assert(Exercises.sumScalars(lVec0, lVec1, rVec0, rVec1) == 5)

      }
      'sumCosines - {
        val lVec0 = Exercises.Vector2D(2, 1)
        val lVec1 = Exercises.Vector2D(0, 4)
        val rVec0 = Exercises.Vector2D(-3, 0)
        val rVec1 = Exercises.Vector2D(7, -2)
        assert(Exercises.sumCosines(lVec0, lVec1, rVec0, rVec1) == -0.5143103521408652)
      }
      'sortByHeavyweight - {
        assert(Exercises.sortByHeavyweight(
          Map(
            "Gadolinium" -> (2, 7.9), "Silver" -> (8, 10.5),"Krypton" -> (5, 3.75), "Silicon" -> (1, 2.33),
            "Zinc" -> (4, 7.13),"Tin" -> (1, 7.29), "Cerium" -> (15, 6.77)))
          == Seq("Silicon", "Tin", "Gadolinium", "Zinc", "Krypton", "Silver", "Cerium"))
        assert(Exercises.sortByHeavyweight(
          Map(
            "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Graphite" -> (12, 2.1), "Iron" -> (3, 7.874),
            "Gold" -> (2, 19.32), "Potassium" -> (14, 0.862), "Calcium" -> (8, 1.55), "Cobalt" -> (4, 8.90),
            "Lithium" -> (12, 0.534), "Magnesium" -> (10, 1.738), "Copper" -> (3, 8.96), "Sodium" -> (5, 0.971),
            "Nickel" -> (2, 8.91), "Tin" -> (1, 7.29), "Platinum" -> (1, 21.45), "Plutonium" -> (3, 19.25),
            "Lead" -> (2, 11.336), "Titanium" -> (2, 10.50), "Silver" -> (4, 4.505), "Uranium" -> (2, 19.04),
            "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45)))
          == Seq("Tin", "Platinum","Nickel","Aluminum","Titanium","Lead","Sodium","Uranium","Gold","Tungsten","Zirconium",
        "Chrome","Iron","Copper","Silver","Plutonium","Cobalt","Cesium","Calcium","Lithium","Magnesium","Potassium","Graphite"))

      }
    }
}
