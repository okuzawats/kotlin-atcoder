package abc196

fun main() {
  val n = readLine()!!.toLong()
  println((1..n).first { "${it}${it}".toLong() > n } - 1)
}