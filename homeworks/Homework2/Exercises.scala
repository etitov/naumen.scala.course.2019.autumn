object Exercises {


  def sumOfDivBy3Or5(iFrom: Int, iTo: Int): Long ={
    var res: Long = 0;
    
    if(iFrom <= iTo){
      for(i <- iFrom to iTo
          if (i % 3 == 0 || i % 5 == 0)) res += i;
    }
    else {
      for(i <- iFrom to iTo by -1
          if (i % 3 == 0 || i % 5 == 0)) res += i;
    }

    res;
  }


  def primeFactor(number: Int): Seq[Int] = {

    if(number <= 1)
      throw new Exception("Your number must be greater than 1");

    var tempNum = number;
    var resultList: List[Int] = List[Int]();
    while(tempNum > 1){
      var i:Int = 2;
      while(tempNum % i != 0) i += 1;
      resultList :+= i;
      tempNum /= i;
    };

    resultList.toSet.toSeq;
  }


  case class Vector2D(x: Double, y: Double)
  def abs(vec: Vector2D): Double = java.lang.Math.sqrt(vec.x * vec.x + vec.y * vec.y)

  def scalar(vec0: Vector2D, vec1: Vector2D): Double = vec0.x * vec1.x + vec0.y * vec1.y

  def cosBetween(vec0: Vector2D, vec1: Vector2D): Double = scalar(vec0, vec1) / abs(vec0) / abs(vec1)

  def sumByFunc(leftVec0: Vector2D, leftVec1: Vector2D, funcName: (Vector2D, Vector2D) => Double,
                rightVec0: Vector2D, rightVec1: Vector2D): Double =
    funcName(leftVec0, leftVec1) + funcName(rightVec0, rightVec1);

  def sumScalars(leftVec0: Vector2D, leftVec1: Vector2D, rightVec0: Vector2D, rightVec1: Vector2D): Double =
      sumByFunc(leftVec0, leftVec1, scalar, rightVec0, rightVec1)


  def sumCosines(leftVec0: Vector2D, leftVec1: Vector2D, rightVec0: Vector2D, rightVec1: Vector2D): Double =
      sumByFunc(leftVec0, leftVec1, cosBetween, rightVec0, rightVec1)

  val balls: Map[String, (Int, Double)] =
    Map(
      "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
      "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
      "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
      "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
      "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
      "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
    )

  def sortByHeavyweight(ballsArray: Map[String, (Int, Double)] = balls): Seq[String] = {

    def findVolume(radius:Int):Double
    = 4*java.lang.Math.PI*radius*radius/3;

    def findMass(radius:Int, density:Double)
    = findVolume(radius) * density;

    def bubbleSort(tempArr:Array[(Double,String)] ): Seq[String] ={
      for(i<- 1 until tempArr.length;
          j <- (i - 1) to 0 by -1) {
        if (tempArr(j)._1 > tempArr(j + 1)._1) {
          val temp = tempArr(j + 1)
          tempArr(j + 1) = tempArr(j)
          tempArr(j) = temp
        }

      }
      var temp: Seq[String] = Seq[String]();
      for(elem <- tempArr) temp :+= elem._2;
      temp;
    }

    var tempList: List[(Double,String)] = List[(Double,String)]();

    for(ball <- ballsArray) tempList :+= (findMass(ball._2._1,ball._2._2),ball._1);
    bubbleSort(tempList.toArray);

  }


}
