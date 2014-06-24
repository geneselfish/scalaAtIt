package chap5_2

import chapt5_2.Programmer

object Main extends App {

  val pg1 = new Programmer
  pg1.coding
  
  //実行時に、java.lang.IllegalArgumentException が発生する。※requireキーワード
  //val pg2 = new Programmer(null)
  
  //コンパニオンオブジェクト
  val ins = SampleCompanion(10)//applyメソッドは省略可能（シンタックスシュガー。糖衣構文）
  println(ins)
}