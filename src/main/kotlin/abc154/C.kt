package abc154

fun main() {
  val n = readLine()!!.toInt()
  println(if (readLine()!!.split(' ').toSet().size == n) "YES" else "NO")
}