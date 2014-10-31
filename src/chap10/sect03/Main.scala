package chap10.sect03

/**
 * 並列コレクション
 * コレクションに対する操作を並列化して別のスレッドで実行する処理を簡単に記述でき、高速に処理できます。
 * 並列コレクションの注意点
 * 並列コレクションは実行にある程度時間がかかり、他の要素の処理結果が関係ない場合に効果を発揮します。
 * ただし、結果を見ると分かるように、処理が終わる順番は保証されないので注意してください。
 */
object Main {

  def main(args: Array[String]): Unit = {
    sum//通常のコレクションでの実行
    parSum//並列コレクションでの実行
  }
  
  def exec(num: Int) = {
    Thread.sleep(1000)
    println("num = " + num)
  }

  def sum = {
    val start = System.currentTimeMillis()
    val list = List(1, 2, 3, 4)
    for(elem <- list) {
        exec(elem)
    }
    println((System.currentTimeMillis() - start) + " msec")
  }
  
  def parSum = {
    val start = System.currentTimeMillis()
    val list = List(1,2,3,4).par//通常のコレクションに対してparメソッドを使用することで、並列コレクションに変換できます。
    for(elem <- list) {
        exec(elem)
    }
    println((System.currentTimeMillis() - start) + " msec")
  }
}