import scala.io.Source
import scala.collection.immutable.SortedMap

def lteqgt(values : Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

val lteqgtValue = lteqgt(Array(3, 1, 5, 8, 33, 24, 9), 8)
print(lteqgtValue)