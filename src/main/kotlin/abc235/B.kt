package abc235

fun main() {
  val n = readLine()!!.toInt()
  val h = readLine()!!.split(' ').map(String::toInt) + -1
  println(h[(0 .. n).first { h[it + 1] <= h[it] }])
}