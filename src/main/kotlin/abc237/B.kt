package abc237

fun main() {
  val s = { readLine()!!.split(' ').map(String::toInt) }
  val (h, w) = s()
  val m = (1..h).map { s() }

  (0 until w).map { i -> (0 until h).map { j -> m[j][i] } }
    .map { it.joinToString(" ") }
    .forEach(::println)
}