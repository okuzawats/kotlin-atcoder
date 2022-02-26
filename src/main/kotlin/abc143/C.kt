package abc143

fun main() {
  val n = readLine()!!.toInt()
  val s = readLine()!!
  println((1 until n).count { s[it - 1] != s[it] } + 1)
}