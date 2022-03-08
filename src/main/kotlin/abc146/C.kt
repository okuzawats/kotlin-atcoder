package abc146

import kotlin.math.*

fun main() {
  val (a, b, x) = readLine()!!.split(' ').map(String::toLong)
  var min = 0L
  var max = 1_000_000_001L
  while (abs(max - min) > 1) {
    val mid = (min + max) / 2
    val d = mid.toString().length
    val p = a * mid + b * d
    if (p <= x) {
      min = mid
    } else {
      max = mid
    }
  }
  println(min)
}