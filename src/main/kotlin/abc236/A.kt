package abc236

fun main() {
  val s = readLine()!!.toCharArray()
  val (a, b) = readLine()!!.split(' ').map(String::toInt).map { it - 1 }
  val t = s[a]
  s[a] = s[b]
  s[b] = t
  println(s.joinToString(""))
}