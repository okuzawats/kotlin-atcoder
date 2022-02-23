package abc164

fun main() {
  val (s, w) = readLine()!!.split(' ').map(String::toInt)
  println(if (w >= s) "unsafe" else "safe")
}