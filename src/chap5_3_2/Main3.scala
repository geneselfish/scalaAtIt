package chap5_3_2

/**
 * 「caseクラス」でオブクジェクトを簡単にパターンマッチ
 * 先ほどはオブジェクトにunapplyを定義してパターンマッチで使いました。
 * しかしScalaでは、オブジェクトを簡単にパターンマッチで使うための方法があります。
 * そのための手段とは、caseクラスを使用することです。
 */
object Main3 {

  def main(args: Array[String]): Unit = {
    val apple = Apple("fuji")
    println(apple)
    val org1 = Orange("DEKOPON")
    val org2 = Orange("ponkan")
    
    matchTest(apple)
    matchTest(org1)
    matchTest(org2)
    
  }
  
  def matchTest(value:Any) = {
    value match {
      case Apple(name) => println("Apple.name=" + name)
      case Orange("DEKOPON") => println("Orange")
      case _ => println("other")
    }
  }
  

}