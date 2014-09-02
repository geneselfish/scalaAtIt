package chap7.sect2

/**
 * トレイトで「super」を使用するには
 */
class Person extends Programmer with Writer {
  /**
   * 同じシグネチャのメソッドを持つトレイトを複数ミックスインしたクラスでは、
   * のメソッドを必ずオーバーライドしなければいけません。
   * 「super」キーワードを使えばミックスインしたトレイトのメソッドを呼び出せます。
   * この場合呼び出されるメソッドは、一番右にあるwithで指定されたトレイト（この場合「Writer」）
   * のメソッドが呼び出されます。
   */
  override def write = super.write//println("ドキュメントを書きます")
  
  /**
   * 一番右に指定したトレイトのメソッドではなく、任意のトレイトのメソッドを呼び出したい場合、
   * 以下の形式でメソッドを呼び出します。
   */
  override def read = super[Programmer].read
}