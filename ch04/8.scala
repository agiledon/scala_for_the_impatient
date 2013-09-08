import scala.io.Source
import scala.collection.immutable.SortedMap

def minmax(values : Array[Int]) = {
	(values.min, values.max)
}

val pair = minmax(Array(3, 1, 5, 8, 33, 24, 9))
print(pair)