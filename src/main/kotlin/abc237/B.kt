package abc237

val s = { readLine()!!.split(' ').map(String::toInt) }

fun main() {
  val (h, w) = s()
  val m = (1..h).map { s() }

  (0 until w).map { i -> (0 until h).map { j -> m[j][i] } }
    .map { it.joinToString(" ") }
    .forEach(::println)
}