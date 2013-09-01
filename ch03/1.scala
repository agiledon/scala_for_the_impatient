def generateArrayWithRandomNumber(n: Int) = {
	val resultArray = new Array[Int](n)
	for (index <- 0 until n) resultArray(index) = scala.util.Random.nextInt(n)
	resultArray
}

val array = generateArrayWithRandomNumber(10)
println(array)
println(array.mkString(", "))
val sorted = array.sorted
println(sorted.mkString(", "))
