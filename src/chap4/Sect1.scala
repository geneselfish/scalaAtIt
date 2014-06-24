package chap4

object Sect1 extends App {
  /*
   * パターンマッチ
   * 「match」構文を使用すると、Javaの「switch-case」文のように複数の選択肢から1つを選ばせる
   * 処理を記述できます。
   */
  //基本形
  val x = 10
  x match {
    case 1 => println("x is 1")
    case 10 => println("x is 10")
    case _ => println("x is other number")
  }
  println()
  //型
  val x2: Any = "hello"
  val res2 =
    x2 match {
    case i:Int => println("x = " + i.toString); 1
    case s:String => println("x = " + s); 2
    case _ => println("other"); 3
  }
  println(res2)
  
  println("★パターンガード")
  def ptnGurd(x:Any):String = x match {
    case i:Int if i >= 100 => "x >= 100"
    case _ => "other"
  }
  println(ptnGurd(99))
  println(ptnGurd(100))
}