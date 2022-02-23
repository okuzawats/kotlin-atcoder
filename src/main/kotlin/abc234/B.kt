package abc234

import kotlin.math.*

fun main() {
  val n = readLine()!!.toInt()
  val p = (0 until n).map { readLine()!!.split(' ').map(String::toInt) }.toTypedArray()
  var m = 0.0
  for (i in 0 until n) {
    for (j in 0 until n) {
      m = max(m, (p[i][0] - p[j][0]).toDouble().pow(2) + (p[i][1] - p[j][1]).toDouble().pow(2))
    }
  }
  println(sqrt(m))
}