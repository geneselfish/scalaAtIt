package chap5.sect1

class PgmrA(val language:String = "スカラ") {
  
  println("Programmerインスタンスを生成します。")
  println("language = " + PgmrA.this.language)
  
  def coding():Unit = {
    println(PgmrA.this.language + "を使ってコーディングします。")
  }
}