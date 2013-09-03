import scala.util.Random

def randomArray(n: Int) = {
	//val resultArray = new Array[Int](n)
	(for (index <- 0 until n) yield Random.nextInt(n)).toArray
	//resultArray
}

val array = generateArrayWithRandomNumber(10)
println(array.mkString(", "))
val sorted = array.sorted
println(sorted.mkString(", "))
