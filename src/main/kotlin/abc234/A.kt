package abc234

val f: (Int) -> Int = { x: Int -> x * x + 2 * x + 3 }

fun main() = readLine()!!.toInt().let { println(f(f(f(it) + it) + f(f(it)))) }