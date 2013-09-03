import scala.util.Random

def generateArrayWithRandomNumber(n: Int) = {
	//val resultArray = new Array[Int](n)
	for (index <- 0 until n) yield Random.nextInt(n)
	//resultArray
}

val array = generateArrayWithRandomNumber(10)
println(array.mkString(", "))
val sorted = array.sorted
println(sorted.mkString(", "))
