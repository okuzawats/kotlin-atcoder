package abc083

// WA
fun main() {
  val (n, a, b) = readLine()!!.split(' ').map(String::toInt)
  println((1..n).filter { it.toString().map(Char::toInt).sum() in a..b }.sum())
}