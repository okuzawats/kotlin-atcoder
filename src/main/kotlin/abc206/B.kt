package abc206

fun main() {
  val n = readLine()!!.toInt()
  println((1..n).first { (1 + it) * it / 2 >= n })
}