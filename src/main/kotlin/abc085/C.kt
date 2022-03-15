package abc085

fun main() {
  val (n, y) = readLine()!!.split(' ').map(String::toInt)
  for (i in 0..n) {
    for (j in 0..(n - i)) {
      val k = n - i - j
      if (i * 10 + j * 5 + k == y / 1000) {
        println("$i $j $k")
        return
      }
    }
  }
  println("-1 -1 -1")
}