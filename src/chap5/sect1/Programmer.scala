package chap5.sect1

class Programmer(var language:String = "Scala") {
  //ここにインスタンス化時の処理を記述する「基本コンストラクタ」
  println("Programmerインスタンスを生成します。")
  println("language = " + this.language)
  
  def coding() = {
    println(this.language + "を使ってコーディングします。")
  }

}