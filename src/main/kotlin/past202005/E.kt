package past202005

fun i(): List<Int> = readLine()!!.split(' ').map(String::toInt)

fun main() {
  val (n, m, q) = i()

  val graph = Array(n) { Array(n) { false } }

  repeat(m) {
    val (u, v) = i().map { it - 1 }
    graph[u][v] = true
    graph[v][u] = true
  }

  val c = i().toIntArray()

  repeat(q) {
    val query = i()

    if (query[0] == 1) {
      val x = query[1] - 1
      println(c[x])
      for (i in 0 until n) {
        if (graph[x][i]) {
          c[i] = c[x]
        }
      }
    } else if (query[0] == 2) {
      val x = query[1] - 1
      val y = query[2]
      println(c[x])
      c[x] = y
    }
  }
}