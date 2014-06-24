package chap3

object Sect1 extends App {
  //コレクション
  /* List
   * Listは先頭項目の追加／削除が高速ですが、
   * 「ランダムアクセス（添え字を使用した要素へのアクセス）が遅い」という特徴を持っており、
   * 先頭から順番に任意の処理していくのに向いています。
   */
  //リストを構築するには「Nil」（空のList）と「::」（cons／コンス）を使用して構築します。
  val list1 = Nil
  // list1: scala.collection.immutable.Nil.type = List()
  val list2 = "Scala" :: list1
  // list2: List[java.lang.String] = List(Scala)
  val list3 = "Java" :: list2
  // list3: List[java.lang.String] = List(Java, Scala)
  /*
   * 結合した要素はListの先頭に追加され、新しいListが返されます。
   * ちょっと分かりにくいですが、メソッド名の最後が「:」（コロン）の場合、
   * メソッド名の左右を入れ替えて記述しなければなりません。
   * つまり、「"Scala" :: list1」という記述は「list1.::("Scala")」という意味になります。
   */
  
  /*
   * Map
   */
  val m = Map("Scala" -> 1, "Java" -> 2, "Ruby" → 3) // ※「->」は全角の「→」で代用可能
  // m: scala.collection.immutable.Map[String,Int] = Map(Scala -> 1, Java -> 2, Ruby -> 3)
  //取り出し方法　２形態
  m("Scala")
  // res10: Int = 1
  m.apply("Java")//※機能的に上と同じ。
  // res12: Int = 2
  
  /*
   * タプル（Tuple）型
   */
  //インスタンス化　４形態
  val t1 = ("Scala",10)
  // t1: (String, Int) = (Scala,10)
  val t2 = Tuple2[String, Int]("Java", 20)
  // t2: (String, Int) = (Java,20)
  val t3 = Tuple3("Curl", 30, 1.1)
  // t3: (String, Int, Double) = (Curl,30,1.1)
  val t4 = "Ruby" -> 3
  // t4: (String, Int) = (Ruby,3)
  //１番目の要素取り出し
  val res13 = t3._1
  //res13: String = Curl
  //３番目の要素取り出し
  val res14 = t3._3
  // res14: Double = 1.1
  //Tupleはメソッドからの戻り値で複数要素を返したいときなどに便利です。
  def f1(arg: Int):(String, Int) = ("×２", arg * 2)
  def f2():Tuple2[String, Int] = "" -> 0
}