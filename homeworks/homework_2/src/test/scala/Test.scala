import Exercises.Vector2D
import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
  }
  val firstTaskTests = Tests {
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1,1)==0)
      assert(Exercises.sumOfDivBy3Or5(3,5)==8)
      assert(Exercises.sumOfDivBy3Or5(-3,3)==0)
    }
  }
  val secondTaskTests = Tests {
    'test_primeFactors - {
      assert(Exercises.primeFactor(80)==Seq(2,5))
      assert(Exercises.primeFactor(98)==Seq(2,7))
      assert(Exercises.primeFactor(13)==Seq(13))
      assert(Exercises.primeFactor(1)==Seq())
    }
  }
  val thirdTaskTestsSumScalars = Tests {
    'test_sumScalars - {
      assert(Exercises.sumScalars(Vector2D(0,0),Vector2D(0,0),Vector2D(0,0),Vector2D(0,0))==0)
      assert(Exercises.sumScalars(Vector2D(1,1),Vector2D(1,1),Vector2D(1,1),Vector2D(1,1))==4)
    }
  }
  val thirdTaskTestsSumCosines = Tests {
    'test_SumCosines - {
      assert(Exercises.sumCosines(Vector2D(0,1),Vector2D(0,2),Vector2D(1,0),Vector2D(2,0))==2)
      assert(Exercises.sumCosines(Vector2D(0,1),Vector2D(1,0),Vector2D(1,0),Vector2D(0,1))==0)
    }
  }
  val fourthTaskTests = Tests {
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Map("Aluminum" -> (42, 2.6889), "Gold" -> (1, 19.32))).head=="Gold")
      assert(Exercises.sortByHeavyweight(Map("Aluminum" -> (2, 2.6889),"Gold" -> (2, 19.32))).head=="Aluminum")
    }
  }
}
