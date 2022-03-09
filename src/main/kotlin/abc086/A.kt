package abc086

fun main() = println(if (readLine()!!.split(' ').all { it.toInt() % 2 > 0 }) "Odd" else "Even")