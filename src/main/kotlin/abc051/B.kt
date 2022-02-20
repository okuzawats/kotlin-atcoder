package abc051

fun main() {
  val (k, s) = readLine()!!.split(' ').map(String::toInt)
  var c = 0
  for (i in 0..k) {
    for (j in 0..k) {
      val z = s - i - j
      c += if (z in 0..k) 1 else 0
    }
  }
  println(c)
}