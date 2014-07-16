package chap5_3_1

class Orange private (val name:String) {

}
/**
 * 「Orange」は引数をSomeでラップして「name」フィールドを返します。
 */
object Orange {
  def apply(name:String): Orange = new Orange(name)
  
  def unapply(a:Orange):Option[String] = Some(a.name)
}