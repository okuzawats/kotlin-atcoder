package abc046

fun main() {
  val (n, k) = readLine()!!.split(' ').map(String::toInt)
  println((2..n).fold(k) { a, _ -> a * (k-1) })
}