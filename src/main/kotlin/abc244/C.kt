package abc244

fun main() {
  val n = readLine()!!.toInt()
  val s = mutableSetOf<Int>().also { it.addAll(2..2 * n + 1) }
  println(1)
  repeat(n) {
    println(readLine()!!.toInt().also(s::remove))
    println(s.first().also(s::remove))
  }
}