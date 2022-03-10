package abc085

fun main() = println((1..readLine()!!.toInt()).map { readLine()!!.toInt() }.distinct().size)