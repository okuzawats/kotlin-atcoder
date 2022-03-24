package abc218

fun main() {
  val n = readLine()!!.toInt() - 1
  val s = readLine()!!
  println(if (s[n] == 'o') "Yes" else "No")
}