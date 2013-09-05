val devices = Map("computer" -> 8000, "ipad" -> 3200, "iphone" -> 3800)
val discountDevices = for ((name, price) <- devices) yield (name, price * 0.9)

println(devices.mkString(", "))
println(discountDevices.mkString(", "))