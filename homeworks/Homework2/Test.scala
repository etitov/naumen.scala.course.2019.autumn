import utest._

object Test extends TestSuite{

  val tests = Tests{ }

  val exercise1PositiveTests = Tests{
    'seqDivBy3And5AtOnce -{
      assert(Exercises.sumOfDivBy3Or5(2,5) == 8);
    }

    'seqDivBy3And5ManyTimes -{
      assert(Exercises.sumOfDivBy3Or5(2,20) == 98);
    }

    'seqDivOnlyBy3 -{
      assert(Exercises.sumOfDivBy3Or5(1,4 ) == 3);
    }

    'seqDivOnlyBy5 -{
      assert(Exercises.sumOfDivBy3Or5(4,5) == 5);
    }

    'seqWithZero -{
      assert(Exercises.sumOfDivBy3Or5(-1, 6) == 14);
    }


    'seqWithNegativeNum -{
      assert(Exercises.sumOfDivBy3Or5(-6, -3) == -14);
    }

    'seqWithNegAndPosNum -{
      assert(Exercises.sumOfDivBy3Or5(-20,20) == 0);
    }

    'seqMaxRange -{
       assert(Exercises.sumOfDivBy3Or5(Int.MinValue,Int.MaxValue) == 0);
    }

    'seqWithoutDividedNum -{
      assert(Exercises.sumOfDivBy3Or5(1,2) == 0);
    }

    'reverseOrder -{
      assert(Exercises.sumOfDivBy3Or5(20,1) == 98 );
    }

    'oneElemSeq -{
      assert(Exercises.sumOfDivBy3Or5(3,3) == 3);
    }

  }


  val exercise2PositiveTests = Tests{
    'simpleNumber -{
      assert(Exercises.primeFactor(103) == Seq(103));
    }

    'notRepeatMultipliers -{
      assert(Exercises.primeFactor(10) == Seq(2,5));
    }

    'repeatMultipliers -{
      assert(Exercises.primeFactor(20) == Seq(2,5));
    }

    'numberIsDegree -{
      assert(Exercises.primeFactor(64) == Seq(2));
    }

    'numberIsMaxValue -{
      assert(Exercises.primeFactor(Int.MaxValue) == Seq(2147483647));
    }
  }

  val exercise3PositiveTests = Tests{

    val vec = Exercises.Vector2D(2,2);

    'allPositiveNumInVec -{
      assert(Exercises.sumScalars(vec,vec,vec,vec) == 16.0);
    }

    'oneVectorIsNull -{
      val nullVec = Exercises.Vector2D(0,0);
      assert(Exercises.sumScalars(nullVec,vec,vec,vec) == 8.0);
    }

    'oneRightOneLeftVecAreNull -{
      val nullVec = Exercises.Vector2D(0,0);
      assert(Exercises.sumScalars(nullVec,vec,nullVec,vec) == 0.0);
    }

    'vectorWithNegNum -{
      val negVec = Exercises.Vector2D(-2,2);
      assert(Exercises.sumScalars(vec,negVec,vec,negVec) == 0.0);
    }


    'cosFromSameVectors -{
      assert(Exercises.sumCosines(vec,vec,vec,vec) == 1.9999999999999998);
    }

    'cosFromNegVectors -{
      val negVec = Exercises.Vector2D(-2,-2);
      assert(Exercises.sumCosines(negVec,vec,negVec,vec) == -1.9999999999999998);
    }
  }

  val exercise4PositiveTests = Tests{
     val resSeq = Exercises.sortByHeavyweight();

     'firstEl -{
       assert(resSeq(0) == "Tin");
     }

     'lastEl -{
        assert(resSeq.last == "Graphite")
     }



    'customMap -{
      val customBalls: Map[String, (Int, Double)] =
        Map(
          "Aluminum" -> (3,   2.6889),
          "Tungsten" ->  (2,   19.35),
          "Iron" ->      (3,   7.874),
        );

      val resSeq = Exercises.sortByHeavyweight(customBalls);
      assert(resSeq.last == "Tungsten");
    }



    'mapWithOneEl -{
      val oneBall: Map[String, (Int, Double)] = Map(
        "Aluminum" -> (3,   2.6889));

      val resSeq = Exercises.sortByHeavyweight(oneBall);
      assert(resSeq.last == "Aluminum");
    }
  }


}
