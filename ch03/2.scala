def swap(a: Array[Int]) = {
	val oddElements = for(index <- 0 until a.length if index % 2 == 1) yield a(index)
	val evenElements = for(index <- 0 until a.length if index % 2 == 0) yield a(index)
	
	var originalIndex = 0
	val length = math.min(oddElements.length, evenElements.length)
	for (i <- 0 until length) { 
		a(originalIndex) = oddElements(i)
		originalIndex += 1
		a(originalIndex) = evenElements(i)
		originalIndex += 1
	} 
	a
}

val array = Array(1, 2, 3, 4, 5, 6)
println(swap(array).mkString(" and "))
