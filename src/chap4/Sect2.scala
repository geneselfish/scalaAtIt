package chap4

object Sect2 extends App {
  
  /*
   * 関数
   * Scalaでdefを用いて関数を定義するには、クラスやオブジェクトのメソッドとして定義しなければ
   * なりません（「ローカル関数」を除く）。
   * ※引数がない場合、「()」を省略することが可能です。※戻り値も型推論によって省略できます。
   */
  //
  def print():Unit = println("hello")
  //引数がない場合、「()」を省略して関数を呼び出すことも可能です。
  print
  /*
   * 引数を取らない関数を「()」なしで定義した場合、呼び出し時に「()」を付けるとエラーになるので、
   * 注意してください。
   */
  
  //関数リテラル
  val func1 = (x:Int, y:Int) => x + y
  //変数「func」の型を明示的に宣言することもできます。
  val func2: (Int, Int) => Int = {(x:Int, y:Int) => x + y}
  //関数を引数に取る関数を定義
  //「calc」という関数は、「Int型の引数を2つ取り、Int型を返す関数」と数値の2つの引数を取ります。
  def calc(f: (Int,Int) => Int, num: Int): Int = f(num, num)
  //呼び出すときに関数リテラルを使用し、第1引数の関数の中身を設定。
  val ans = calc((x, y) => x + y, 3)
  println(ans)
  //さらに簡略化
  val ans2 = calc(_ + _, 10)
  println(ans2)
  //返り値に関数オブジェクトを返す「高階関数」
  //String型引数を1つ取り、「Int型引数を2つ取り、String型を返す関数」を返す関数を定義
  def getFunc(str:String): (Int,Int) => String = (x:Int, y:Int) => str + (x + y)
  val func = getFunc("result is ")
  def result = func(1, 2)
  println(result)

}