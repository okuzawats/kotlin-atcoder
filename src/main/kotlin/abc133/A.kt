package abc133

import kotlin.math.*

fun main() {
  val (n, a, b) = readLine()!!.split(' ').map(String::toInt)
  println(min(n * a, b))
}