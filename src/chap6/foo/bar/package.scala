package chap6.foo
/**
 * パッケージオブジェクト
 * パッケージオブジェクトを使用することで、パッケージ自体にメソッドや定数を定義できます。
 * これでfoo.barパッケージにあるクラスからはimport文なしでbaz変数やgetBazメソッドが使えます。
 */
package object bar {
  val baz = "baz!"
  def getBaz = baz
}