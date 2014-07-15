package chap5_3_1

class Apple
/**
 * 「Apple」は「match」で指定された値の型をチェックし、
 * 「Apple」型であればマッチしたと見なします（※isInstanceOfで型のチェックが可能）。
 */
object Apple {
	def unapply(a:Any):Boolean = a.isInstanceOf[Apple]
}