package past202005

fun i(): List<Int> = readLine()!!.split(' ').map(String::toInt)

fun main() {
  // n: 頂点の数
  // m: 無向辺の数
  // q: クエリの数
  val (n, m, q) = i()

  // n x nの隣接行列を作る。
  // 頂点iと頂点jの間に辺があればtrue、なければfalseとなる。
  // はじめにfalseで初期化する。
  val graph = Array(n) { Array(n) { false } }

  // ui、viを読み、隣接行列のBooleanを更新する。
  // iは1始まりなので、0始まりに変換するため-1する。
  repeat(m) {
    val (u, v) = i().map { it - 1 }
    graph[u][v] = true
    graph[v][u] = true
  }

  // c: i番目のスプリンクラーの色を表す配列
  val c = i().toIntArray()

  // クエリの数（q）だけ処理を繰り返す。
  repeat(q) {
    val query = i()

    if (query[0] == 1) {
      // クエリの種別が"1"だった場合は、頂点xの色を出力する。
      val x = query[1] - 1
      println(c[x])
      // その後、xに隣接するスプリンクラーの色をxの色に変更する。
      for (i in 0 until n) {
        if (graph[x][i]) {
          c[i] = c[x]
        }
      }
    } else if (query[0] == 2) {
      // クエリの種別が"2"だった場合は、頂点xの色を出力し、その後、xの色をyに変更する。
      val x = query[1] - 1
      val y = query[2]
      println(c[x])
      c[x] = y
    }
  }
}