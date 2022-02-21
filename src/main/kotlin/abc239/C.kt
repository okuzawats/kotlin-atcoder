package abc239

fun main() {
  val (x1, y1, x2, y2) = readLine()!!.split(' ').map(String::toInt)
  println(
    if (((x1 - 2)..(x1 + 2))
        .any { x ->
          ((y1 - 2)..(y1 + 2))
            .any { y ->
              (x - x1) * (x - x1) + (y - y1) * (y - y1) == 5 && (x - x2) * (x - x2) + (y - y2) * (y - y2) == 5
            }
        }
    ) "Yes" else "No"
  )
}