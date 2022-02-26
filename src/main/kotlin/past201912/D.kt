package past201912

fun i(): Int = readLine()!!.toInt()

fun main() {
  val r = 1..i()
  val a = r.map { i() }
  val b = r.filter { !a.contains(it) }
  println(
    if (b.isEmpty()) {
      "Correct"
    } else {
      val x = a.groupBy { it }.filter { it.value.size == 2 }.map { it.key }[0]
      val y = b[0]
      "$x $y"
    }
  )
}