package chapt5_2

class Programmer(_language:String) {
  //基本コンストラクタ
  println("Programmerインスタンスを生成します。")
  println("language = " + _language)

  //引数がnullだったらエラー※事前条件を指定する「require」キーワード
  require(_language != null)
  
  /**   */
  val language = _language
  
  /** 補助コンストラクタ */
  def this() = this("Scala")
  
  def coding() = {
    println(this.language + "を使ってコーディングします。")
  }

}