package abc165

fun main() {
  val x = readLine()!!.toLong()
  var a = 100L
  var n = 0L
  while (a < x) {
    n += 1
    a += a / 100
  }
  println(n)
}