def func(x: Int, n : Int): Int = {
	if (n == 0) 1
	else {
		if (n > 0) {
			if (n % 2 == 0) {
				 func(x, n/2) * func(x, n/2)
			} else {
				x * func(x, n - 1)
			}
		}else (1/func(x, -n))
	}
}

println(func(10, 2))
println(func(10, 3))
println(func(10, 0))
println(func(10, -2))
