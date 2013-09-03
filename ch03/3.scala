import scala.util.Random

def randomArray(n: Int) = {
	(for (index <- 0 until n) yield Random.nextInt(n)).toArray
}

def swap(array: Array[Int]) = {
	for (i <- 0 until array.length) 
		yield if (i % 2 == 0)
		      	if (i < array.length - 1)
				array(i + 1)
		      	else
				array(i)
		      else	array(i - 1)
}

val a = randomArray(9)
println(a.mkString(", "))
val swaped = swap(a)
println(swaped.mkString(", "))

