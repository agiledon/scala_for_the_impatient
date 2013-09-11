class Counter {
	private var value = Int.MaxValue - 2
	def increment() = {
		if (value == Int.MaxValue) value else value += 1
	}
	def current = value
}

val counter = new Counter()
for (i <- 1 to 4) {
	counter.increment
	println(counter.current)
}