package chap6.sect2_3

/**
 * @author 1134310008768
 *
 */
abstract class Engineer {
  /**
   * 抽象メソッド
   */
  def work():Unit
  /**
   * 具象メソッド
   */
  def study() = printf("勉強します")

}