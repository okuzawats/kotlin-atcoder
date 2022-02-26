package abc144

fun main() {
  val n = readLine()!!.toInt()
  println(if ((1..9).map { a -> (1..9).map { a * it } }.flatten().any { it == n }) "Yes" else "No")
}