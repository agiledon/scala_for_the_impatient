import scala.io.Source

val source = Source.fromFile("2.scala", "UTF-8")
val words = source.mkString.split(" ")

var wordCounts = Map[String, Int]()
for (word <- words) wordCounts = wordCounts + (word -> (wordCounts.getOrElse(word, 0) + 1))

print(wordCounts)