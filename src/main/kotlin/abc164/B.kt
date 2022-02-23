package abc164

fun main() {
  var (a, b, c, d) = readLine()!!.split(' ').map(String::toInt)
  var t = 1
  while (a > 0 && c > 0) {
    if (t % 2 > 0) {
      c -= b
    } else {
      a -= d
    }
    t += 1
  }
  println(if (c <= 0) "Yes" else "No")
}