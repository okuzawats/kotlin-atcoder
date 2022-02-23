package abc148

tailrec fun gcd(a: Long, b: Long): Long =
  if (b == 0L) a
  else gcd(b, a % b)

fun lcm(a: Long, b: Long) = a / gcd(a, b) * b

fun main() {
  val (a, b) = readLine()!!.split(' ').map(String::toLong)
  println(lcm(a, b))
}