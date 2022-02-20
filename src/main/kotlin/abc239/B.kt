package abc239

fun main() {
  val d = readLine()!!.toLong()
  println(if (d < 0 && d % 10 < 0) d / 10 - 1 else d / 10)
}