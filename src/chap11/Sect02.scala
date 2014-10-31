package chap11

/**
 * 関数の引数の遅延評価
 */
object Sect02 {

  /**
   * 通常、関数パラメータは値渡しですが、名前渡しパラメータを使えば、
   * 引数が必要になったタイミングで評価させることが可能です。
   * 名前渡しパラメータは下記のように、関数／パラメータに通常使う丸括弧を省略することで指定します。
   * 
   */
  def main(args: Array[String]): Unit = {
    //条件が真の間、第2引数に指定した処理がmyWhile関数の中で実行されています。
    var count = 0
    myWhile(count < 3) {
      println("count=" + count)
      count += 1
    }
  }

  /**
   * while文のような動作を実現する。
   * 条件文を指定するconditional部分は名前渡しパラメータになっています。
   * 第2引数には、条件が真の場合に実行する処理を記述します。
   */
  def myWhile(conditional: => Boolean)(f: => Unit) {
    println("myWhile")
    if (conditional) {
      f
      myWhile(conditional)(f)
    }
  }
}