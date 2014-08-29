package chap6.sect2_3

/**
 * @author 1134310008768
 *
 */
class Programmer(name:String, val age:Int) extends Engineer(name) {
  println("Programmer.name=" + name)
  println("Programmer.age=" + age)
  
  /**
   * 抽象メソッドをオーバーライドする場合にはoverrideキーワードはあってもなくても構いません。
   */
  def work():Unit = printf("%s(%d)さんはコーディングします", this.name, this.age)
  /**
   * 具象メンバをオーバーライドする場合、必ずoverrideキーワードが必要です。
   */
  override def study() = println("プログラミングの勉強します")
}