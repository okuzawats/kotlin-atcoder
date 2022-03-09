package abc087

fun i(): Int = readLine()!!.toInt()

fun main() {
  val a = i(); val b = i(); val c = i(); val x = i();
  var ans = 0
  for (i in 0..a) {
    for (j in 0..b) {
      for (k in 0..c) {
        ans += if (i * 500 + j * 100 + k * 50 == x) 1 else 0
      }
    }
  }
  println(ans)
}