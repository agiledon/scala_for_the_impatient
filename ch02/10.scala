def xn(n : Int): Int = {
	if (n == 0) 1
	else if (n == 1) 2
	else if (n > 0 && n % 2 == 0) xn(n / 2) * xn(n / 2)
	else if (n > 0 && n % 2 == 1) xn(1) * xn(n - 1)
	else 1 / xn(-1 * n)
}

println(xn(2))
println(xn(20))
println(xn(3))
println(xn(-5))
