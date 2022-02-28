package abc232

fun c(): CharArray = readLine()!!.toCharArray()

fun main() = println(if (c().zip(c()).map { (it.first - it.second + 26) % 26 }.toSet().size == 1) "Yes" else "No")