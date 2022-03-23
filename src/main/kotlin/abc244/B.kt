package abc244

fun main() {
  readLine()
  val t = readLine()!!.split('R').map { it.length }
  var x = 0; var y = 0
  repeat(t.size) {
    when (it % 4) {
      0 -> x += t[it]
      1 -> y -= t[it]
      2 -> x -= t[it]
      3 -> y += t[it]
    }
  }
  println("$x $y")
}