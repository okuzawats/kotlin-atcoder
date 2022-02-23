package abc188

fun l(): List<Int> = readLine()!!.split(' ').map(String::toInt)

fun main() {
  readLine()
  println(if (l().zip(l()).sumBy { (a: Int, b: Int) -> a * b } == 0) "Yes" else "No")
}