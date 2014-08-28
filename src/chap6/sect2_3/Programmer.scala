package chap6.sect2_3

/**
 * @author 1134310008768
 *
 */
class Programmer(name:String, age:Int) extends Engineer {
  /**
   * 抽象メソッドをオーバーライドする場合にはoverrideキーワードはあってもなくても構いません。
   */
  def work():Unit = printf("%s(%d)さんはコーディングします", this.name, this.age)
  /**
   * 具象メンバをオーバーライドする場合、必ずoverrideキーワードが必要です。
   */
  override def study() = println("プログラミングの勉強します")
}