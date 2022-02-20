package abc239

import kotlin.math.sqrt

fun main() {
  val h = readLine()!!.toLong()
  println("${sqrt((h * (12800000 + h)).toDouble())}")
}