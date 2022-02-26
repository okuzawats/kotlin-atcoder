package abc132

fun main() {
  val s = readLine()!!.toCharArray().sorted()
  println(if (s.toSet().size == 2 && s[0] == s[1] && s[2] == s[3]) "Yes" else "No")
}