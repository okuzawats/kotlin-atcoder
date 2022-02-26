package abc132

fun main() {
  val n = readLine()!!.toInt()
  val p = readLine()!!.split(' ').map(String::toInt)
  println((1 until n - 1).count { i -> (p[i - 1] < p[i] && p[i] < p[i + 1]) || (p[i - 1] > p[i] && p[i] > p[i + 1]) })
}