package abc233

fun main() {
  val (l, r) = readLine()!!.split(' ').map(String::toInt)
  val s = readLine()!!
  println(s.take(l - 1) + s.substring(l - 1, r).reversed() + s.drop(r))
}