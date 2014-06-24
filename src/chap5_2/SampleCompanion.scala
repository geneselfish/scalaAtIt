package chap5_2
/*
 * 「コンパニオンオブジェクト」とは、あるクラスに対して同じスコープ、同じ名前で定義された
 * シングルトンオブジェクトです。
 * classとobjectが同じファイル、同じパッケージの中に、同じ名前で宣言されていれば、
 * それはコンパニオンオブジェクトとなります。
 * コンパニオンオブジェクトは、コンパニオンクラスのprivateなフィールドやメソッドに対して
 * アクセスができるという特徴があります。
 */

/**
 * ※クラス名の後にprivateを付けると、基本コンストラクタがprivateになります。
 */
class SampleCompanion private (val num:Int)

/**
 * コンパニオンオブジェクト
 * クラスのprivateなコンストラクタに対して、objectからアクセスしています。
 */
object SampleCompanion {
  def apply(num:Int) = {
    new SampleCompanion(num)
  }
}