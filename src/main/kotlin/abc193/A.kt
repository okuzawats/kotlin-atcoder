package abc193

fun main() {
  val (a, b) = readLine()!!.split(' ').map(String::toDouble)
  println((a - b) / a * 100.0)
}