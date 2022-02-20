package abc236

fun read() = readLine()!!.split(' ')

fun main() {
  read()
  val s = read()
  val t = read().toSet()
  s.forEach {
    println(if (t.contains(it)) "Yes" else "No")
  }
}