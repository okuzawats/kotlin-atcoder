package abc241

fun i(): List<Int> = readLine()!!.split(' ').map(String::toInt)

fun main() {
  i()
  val a = i()
  val b = i()
  println(if (b.toSet().all { _b -> a.count { it == _b } >= b.count { it == _b } }) "Yes" else "No")
}