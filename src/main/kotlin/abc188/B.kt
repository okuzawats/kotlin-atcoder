package abc188

fun l(): List<Int> = readLine()!!.split(' ').map(String::toInt)

fun main() {
  readLine()
  println(if (l().zip(l()).sumBy { (a, b) -> a * b } == 0) "Yes" else "No")
}