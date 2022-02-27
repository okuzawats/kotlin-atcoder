package abc223

fun main() = readLine()!!.toInt().let { println(if (it > 0 && it % 100 == 0) "Yes" else "No") }