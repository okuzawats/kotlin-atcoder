package abc239

import kotlin.math.pow

fun main() {
  val h = readLine()!!.toLong()
  println("${(h * (12800000 + h)).toDouble().pow(0.5)}")
}