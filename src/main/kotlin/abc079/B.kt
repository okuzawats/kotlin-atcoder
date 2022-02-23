package abc079

fun main() {
  val n = readLine()!!.toInt()
  val m = mutableMapOf<Int, Long>()
  fun f(_n: Int): Long {
    if (m.containsKey(_n)) return m[_n]!!
    val l = when (_n) {
      0 -> 2L
      1 -> 1L
      else -> f(_n - 1) + f(_n - 2)
    }
    m[_n] = l
    return l
  }
  println(f(n))
}