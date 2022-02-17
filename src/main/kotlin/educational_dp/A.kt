package educational_dp

import java.lang.Math.*

fun main() {
  val n = readLine()!!.toInt()
  val h = readLine()!!.split(' ').map(String::toInt)

  val c = IntArray(n)
  c[0] = 0
  c[1] = c[0] + abs(h[1] - h[0])
  (2 until n).forEach { m ->
    c[m] = min(c[m - 1] + abs(h[m] - h[m - 1]), c[m - 2] + abs(h[m] - h[m - 2]))
  }
  println(c[n - 1])
}