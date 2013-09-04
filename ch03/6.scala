import scala.collection.mutable.ArrayBuffer

def reverse(array: Array[Int]) = {
	(for (i <- (0 until array.length).reverse) yield array(i)).toArray
}

val a = Array(1, 3, -2, 4, -7, 0, 8)
println(a.mkString(", "))
val reversed = reverse(a)
println(reversed.mkString(", "))

