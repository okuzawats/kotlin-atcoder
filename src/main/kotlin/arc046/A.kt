package arc046

fun main() {
  val n = readLine()!!.toInt()
  val c = with(n % 9) { if (this != 0) this else 9 }
  val r = with(n / 9) { if (c != 9) this + 1 else this }
  println("$c".repeat(r))
}