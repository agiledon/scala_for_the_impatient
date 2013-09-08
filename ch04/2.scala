import scala.io.Source
import scala.collection.mutable.Map

val source = Source.fromFile("2.scala", "UTF-8")
val words = source.mkString.split(" ")

val wordCounts = Map[String, Int]() withDefault(_ => 0)
for (word <- words) wordCounts(word) += 1
	
print(wordCounts)