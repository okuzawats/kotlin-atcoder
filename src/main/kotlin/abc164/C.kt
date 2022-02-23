package abc164

fun main() = println((1..readLine()!!.toInt()).map { readLine()!! }.distinct().size)