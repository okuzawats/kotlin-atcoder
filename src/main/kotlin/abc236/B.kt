package abc236

fun main() {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(' ').map(String::toInt)
  println(2 * n * n + 2 * n - a.sum())
}