package chap2

object Sect1 extends App {

  //型推論
  val i = 10
  // i: Int = 10
  
  val lng = 100L
  // lng: Long = 100
  
  val d = 1.0
  // d: Double = 1.0
  
  val f = 2.0f
  // f: Float = 2.0
  
  //
  // エスケープシーケンス
  val es = "\"\'\\"
  // es: String = "'\
  
  //「"""」（ダブルクオート3つ）を使用して文字列を囲むと、「生の文字列（raw string）」を使えます。
  //これは文字列内のエスケープシーケンスを無視し、改行などもそのまま記述できます。
  val raw = """\"\'\\"""
  // raw: String = \"\'\\
    
  /*
   * シンボルリテラルは「'」（シングルクオート）を名前の前に付けることで、その名前を表すSymbolリテラルとなります。
   * これは「scala.Symbol」のインスタンスで、「'symbol」というリテラルは、「scala.Symbol("symbol")」という式と同じ意味です。
   * なお、同じ名前を持った2つのシンボルは、同じオブジェクトを示します。
   * そのため、マップのキーとして文字列の代わりにSymbolを使うことがあります。
   */
  val s = 'sSymbol
  // s: Symbol = 'sSymbol
  
}