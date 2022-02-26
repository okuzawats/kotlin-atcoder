package past202004

fun main() = println(readLine()!!.groupBy { it }.entries.maxBy { it.value.size }!!.key)