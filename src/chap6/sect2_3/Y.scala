package chap6.sect2_3

class Y extends X {
  /*
   * Scalaではフィールドとメソッドを統一的に扱う。
   * パラメータなしのメソッドはvalでオーバーライドが可能。
   */
  override val contents  = "contents!"
}