package chap11.sect03

object Sect03 {

  def main(args: Array[String]): Unit = {
    //自分型アノテーション利用例
    val c = new MyController with MyServiceImpl
    c.execute
    
    //implicit Class 利用例
    100.show
  }
  
  /**
   * implicit Class
   * implicit Classを使うには、拡張した結果のクラスに「implicit」キーワード付与し、
   * そのクラスのコンストラクタに、拡張元のクラスを指定します。
   */
  implicit class RichInt(self: Int) {
    def show(): Unit = println(self)
  }

}