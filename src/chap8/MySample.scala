package chap8

/**
 * 型パラメータを使用したクラスの定義
 */
class MySample[A] {
  
  var param: A = _
  
  def get: A = this.param
  def set(param: A) = this.param = param
  
  /**
   * 型パラメータを使用したメソッドの定義
   */
  def call[B](arg: B): B = arg
}