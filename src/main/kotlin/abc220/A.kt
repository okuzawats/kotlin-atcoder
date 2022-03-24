package abc220

fun main() {
  val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
  println(((a / c)..(b / c)).map { it * c }.firstOrNull { it  in a..b } ?: -1)
}