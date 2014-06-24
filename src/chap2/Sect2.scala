package chap2

object Sect2 extends App {
  //Scalaで配列を使用するには、「Array」クラスを使います。
  val a1 = Array(1, 2, 3)
  // a1: Array[Int] = Array(1, 2, 3)
  /*
   * Scala配列はJavaの配列と対応しています
   * （Scalaの「Array[Int]」はJavaの「int[]」として表現できます）。
   */
  
  val a2 = Array(1, 2L, 3.0f, 4.0)
  // a2: Array[Double] = Array(1.0, 2.0, 3.0, 4.0)
  
  val a3 = Array[AnyVal](1, 2L, 3.0f, 4.0)
  // a3: Array[AnyVal] = Array(1, 2, 3.0, 4.0)
  a3(0)
  // res3: AnyVal = 1
  
  //演算子
  /*
   * Scalaでは、演算子は、すべてメソッドです。例えば、「1 + 2」という式を見てみましょう。
   * この「+」は、Intクラスが持つメソッドなのです。
   * Scalaはメソッドが1つの引数を取る場合、ピリオドと「（）」を省略できます。
   * そのため、メソッド呼び出しが演算子と同じように見えるのです。
   */
  val res6 = 1 .+(2) // 1の後に「.」を付けると、Doubleと判断されるので、スペースを入れる
  // res6: Int = 3
  // また、引数を取らないメソッドはピリオドを付けずに呼び出し可能です。
  
  /*
   * Javaと違い、インクリメントとデクリメントは存在しません。
   * 「+=」「-=」演算子を使用してください。
   */
}