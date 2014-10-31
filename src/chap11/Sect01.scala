package chap11

object Sect01 {

  def main(args: Array[String]): Unit = {
    //名前付き引数を使うときは、関数呼び出し時に「引数名 = 値」の形式で引数を指定します。
    //こうすることで、引数の順番を任意の順番に変えられます。
    println(
      division(y = 10, x = 50)
    )
    //また、下記のように、デフォルト引数と組み合わせて使えることも多いです。
    println(
      birth(2012, 10, 5)
    )
    //途中まで引数順に値を記述し、残りの引数を名前指定にすることも可能です。
    println(
      birth(1980, day=5, month=10)
    )
    //メソッドの引数すべてに初期値が指定されている場合、任意の部分だけ値を上書きして呼び出せます。
    println(birth2())
    println(birth2(month = 8))
    
    /*
     * 名前付き引数をよく利用するケースとしては、下記のようにcopyメソッドを使って
     * case classの一部プロパティだけ変更した新しいインスタンスが欲しい場合に使えます。
     */
    val x = X(1, "hello")
    println(x)
    val x2 = x.copy(b = "copy hello") //bだけ違う値にしたインスタンスを作成
    println(x2)
  }

  def division(x: Int, y: Int): Int = x / y
  
  def birth(year: Int, month: Int, day: Int, msg: String = " Your BirthDay is "): String = {
    msg + "%d/%d/%d".format(year, month, day)
  }
  
  def birth2(year: Int = 1968, month: Int = 1, day: Int = 1, msg: String = " Your BirthDay is "): String = {
    "%s%d/%d/%d.".format(msg, year, month, day)
  }
}