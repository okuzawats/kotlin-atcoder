package abc088

fun main() {
  var alice = 0
  var bob = 0
  readLine()
  readLine()!!.split(' ')
    .map(String::toInt)
    .sortedDescending()
    .forEachIndexed { index, i ->
      if (index % 2 == 0) alice += i
      else bob += i
    }
  println(alice - bob)
}