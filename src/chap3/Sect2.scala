package chap3

object Sect2 extends App {

  //Scalaのifは最後に評価された値を返します。
  val x = 0
  val (result1, result2) =
    if(x == 0) {
      println("x==0")
      ("x is zero", x)
    } else if(x == 1) {
      println("x==1")
      ("x is one", x)
    } else {
      println("x != 0 && x != 1")
      ("x is " + x, x)
    }
  // result1: String = x is zero
  // result2: Int = 0
  /*
   * もし条件式がfalseになり、elseがなかった場合、返される値はUnit
   * （Javaでいう「void」）の唯一の値、「()」になるので注意してください。
   */
  val y = 1
  val result = if(y==0) "y is zero"
  // result: Any = ()
    
  //Scalaの繰り返し「for」
  val listItems = List("Scala", "Java", "Ruby")
  for(item ← listItems) println("item = " + item)// ※「<-」 は全角の「←」で代用可能
  println()
  //forのフィルタ
  for(
      item <- listItems
      if item.length() > 4
  ) println("item = " + item)
  println()
  
  //「yield」を使用して新しいコレクションを生成できます。
  val resultList = for(item <- listItems) yield item.length()
  println(resultList)
  //Listのmapメソッドも同様
  val resultList2 = listItems.map(_.length())
  println(resultList2)
  println()
  
  //Scalaの例外処理
  val r1 =
    try {
      "a".toInt
    } catch {
      case e:NumberFormatException => {
        println("exception")
        -1
      }
    } finally {
      println("finally")
    }
  println(r1)
}