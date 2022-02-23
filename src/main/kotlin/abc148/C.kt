package abc148

import java.math.*

fun main() {
  val (a, b) = readLine()!!.split(' ').map(::BigInteger)
  println(a / a.gcd(b) * b)
}