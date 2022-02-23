package abc058

fun main() {
  val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
  println(if (c - b == b - a) "YES" else "NO")
}