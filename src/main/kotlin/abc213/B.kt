package abc213

fun main() {
  readLine()
  val a = readLine()!!.split(' ').map(String::toInt)
  println(a.indexOf(a.sorted()[a.lastIndex - 1]) + 1)
}