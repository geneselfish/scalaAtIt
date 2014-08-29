package chap6.sect2_3

/**
 * 抽象クラス。
 * なお、抽象クラスでフィールドを値なしで宣言すると、それは抽象フィールドとなり、
 * サブクラスでの値の設定が期待されます。
 *
 */
abstract class Engineer(val name:String) {
  println("Engineer.name=" + this.name)
  
  /**
   * 抽象メソッド
   */
  def work():Unit
  /**
   * 具象メソッド
   */
  def study() = printf("勉強します")

}