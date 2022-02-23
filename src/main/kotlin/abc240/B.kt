package abc240

fun main() {
  readLine()
  println(readLine()!!.split(' ').map(String::toInt).distinct().size)
}