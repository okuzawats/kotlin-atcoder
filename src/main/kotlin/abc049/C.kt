package abc049

fun main() {
  var s = readLine()!!
  var cnt = true
  while (s.length > 0 && cnt) {
    when {
      s.endsWith("dreamer") -> s = s.substring(0, s.lastIndexOf("dreamer"))
      s.endsWith("eraser") -> s = s.substring(0, s.lastIndexOf("eraser"))
      s.endsWith("dream") -> s = s.substring(0, s.lastIndexOf("dream"))
      s.endsWith("erase") -> s = s.substring(0, s.lastIndexOf("erase"))
      else -> cnt = false
    }
  }
  println(if (cnt) "YES" else "NO")
}