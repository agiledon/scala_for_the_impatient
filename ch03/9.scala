def getAmericaTimeZones = {
	val timeZones = java.util.TimeZone.getAvailableIDs
	println(timeZones.mkString(", "))
	timeZones.filter(_.startsWith("America")).map(_.stripPrefix("America/"))
}

println(getAmericaTimeZones.mkString(", "))

