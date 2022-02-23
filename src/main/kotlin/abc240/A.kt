package abc240

fun main() {
  val (a, b) = readLine()!!.split(' ').map(String::toInt)
  println(if (b - a == 1 || (b == 10 && a == 1)) "Yes" else "No")
}