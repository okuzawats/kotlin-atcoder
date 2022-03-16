package past201912

fun main() {
  val n = readLine()!!.toInt()
  val c = readLine()!!.split(' ').map(String::toInt).toIntArray()

  var total = 0
  repeat(readLine()!!.toInt()) {
    val s = readLine()!!.split(' ').map(String::toInt)
    when {
      s[0] == 1 -> {
        val x = s[1] - 1
        val a = s[2]
        if (c[x] >= a) {
          total += a
          c[x] -= a
        }
      }
      s[0] == 2 -> {
        val a = s[1]
        if (c.filterIndexed { index, _ -> index % 2 == 0 }.all { it >= a }) {
          for (i in c.indices) {
            if (i % 2 == 0) {
              total += a
              c[i] -= a
            }
          }
        }
      }
      s[0] == 3 -> {
        val a = s[1]
        if (c.all { it >= a }) {
          for (i in c.indices) {
            total += a
            c[i] -= a
          }
        }
      }
    }
  }
  println(total)
}