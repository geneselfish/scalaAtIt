package chap6.sect3.sealedmodel

/**
 * シールドクラスを継承するケースクラスを使ってマッチ式を書くと、
 * 対応できていないパターンの組み合わせをチェックして警告してくれます。
 */
object Main extends App {
  
  val e:Engineer = new Programmer
  e match {
    case p:Programmer => println("Programmer")
    case t:Tester => println("Tester")
  }

}