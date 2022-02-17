package educational_dp

import java.lang.Math.*

fun main() {
  val n = readLine()!!.toInt()
  val h = readLine()!!.split(' ').map(String::toInt)

  val c = IntArray(n)
  val diff = { i: Int, j: Int -> abs(h[i] - h[j]) }
  val cal = { i: Int -> min(c[i - 1] + diff(i, i - 1), c[i - 2] + diff(i, i - 2)) }

  c[0] = 0
  c[1] = c[0] + diff(1, 0)
  (2 until n).forEach { c[it] = cal(it) }
  println(c[n - 1])
}