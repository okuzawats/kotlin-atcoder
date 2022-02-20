package abc239

import kotlin.math.sqrt

fun main() = readLine()!!.toDouble().let { println("${sqrt((it * (12800000 + it)))}") }