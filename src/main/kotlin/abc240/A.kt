package abc240

import kotlin.math.*

fun main() {
  val (a, b) = readLine()!!.split(' ').map(String::toInt)
  val ans = if (a == 10 && (b == 1 || b == 9)) {
    "Yes"
  } else if (b == 10 && (a == 1 || a == 9)) {
    "Yes"
  } else if (abs(a - b) == 1) {
    "Yes"
  } else {
    "No"
  }
  println(ans)
}