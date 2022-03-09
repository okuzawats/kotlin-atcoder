package abc081

import kotlin.math.*

fun main() {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(' ').map(String::toInt)
  var ans = Int.MAX_VALUE
  a.forEach {
    var _a = it
    var c = 0
    while (_a % 2 == 0) {
      _a /= 2
      c += 1
    }
    ans = min(ans, c)
  }
  println(ans)
}