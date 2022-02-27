package abc233

import kotlin.math.*

fun main() {
  val (x, y) = readLine()!!.split(' ').map(String::toInt)
  println(max(0, (y - x + 9) / 10))
}