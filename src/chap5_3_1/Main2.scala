/**
 *
 */
package chap5_3_1

/**
 * 「unapply」を使用したパターンマッチ
 * 自分で定義したクラスもcase部分に指定できます。
 * ただし、そのままではパターンマッチの対象になりません。
　「unapply」はインスタンス構成要素を抽出するためのメソッドで、「抽出子」とも呼びます。
 * このメソッド定義することで、オブジェクトをcase部分に指定できます。
 */
object Main2 {

  def main(args: Array[String]): Unit = {
    matchTest(Orange("something"))
    
    matchTest(Orange("DEKOPON"))
    
    //matchTest(new Apple)
    matchTest(Apple)
    
    matchTest("hello")
  }
  
  def matchTest(value:Any) = {
    value match {
      case Apple => println("Apple")
      case Orange("DEKOPON") => println("Orange.name=DEKOPON")
      case Orange(name) => println("Orange.name=" + name)
      case _ => println("other")
    }
  }

}