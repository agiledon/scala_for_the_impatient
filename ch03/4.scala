import scala.collection.mutable.ArrayBuffer

def sort(array: Array[Int]) = {
	array.filter(_ > 0) ++ array.filter(_ <= 0)
}

val a = Array(1, 3, -2, 4, -7, 0, 8)
println(a.mkString(", "))
val sorted = sort(a)
println(sorted.mkString(", "))

