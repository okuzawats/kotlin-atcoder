package past201912

fun main() {
  // n: ユーザの数
  // q: 操作ログの行数
  val (n, q) = readLine()!!.split(' ').map(String::toInt)

  // n x nの隣接行列
  // trueはフォローしている、falseはフォローしていない状態を表す。
  // falseで初期化される。
  val graph = Array(n) { BooleanArray(n) { false } }

  repeat(q) {
    // 操作ログ
    // [1, a, b] or [2, a] or [3, a]
    val s = readLine()!!.split(' ').map(String::toInt).toIntArray()
    when {
      // ユーザaがユーザbをフォロー
      s[0] == 1 -> {
        val a = s[1] - 1
        val b = s[2] - 1
        graph[a][b] = true
      }
      // ユーザaがユーザaをフォローしているユーザを全員フォロー
      s[0] == 2 -> {
        val a = s[1] - 1
        for (i in 0 until n) {
          if (graph[i][a]) graph[a][i] = true
        }
      }
      // ユーザaがフォローしているユーザのフォローしているユーザを全員フォロー
      s[0] == 3 -> {
        val a = s[1] - 1
        val b = BooleanArray(n)
        for (i in 0 until n) {
          if (graph[a][i]) {
            for (j in 0 until n) {
              if (graph[i][j]) b[j] = true
            }
          }
        }
        for (i in 0 until n) if (b[i]) graph[a][i] = true
      }
    }
  }

  graph.map { it.map { f -> if (f) 'Y' else 'N' } }.forEach { println(it.joinToString("")) }
}