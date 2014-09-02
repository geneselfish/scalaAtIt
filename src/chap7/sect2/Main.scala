package chap7.sect2

object Main extends App {
  //トレイト単体での使用
  //トレイト単体でもインスタンス化できます。
  //トレイト名の後ろの「{}」は必須です。これは、
  //Programmerトレイトをミックスインした無名クラスのインスタンスを作成することを意味しています。
  val p = new Programmer{}
  p.write
  
  //トレイトのwriteが抽象メソッドだった場合、下記のようにインスタンス化のタイミングで実装できます。
  val a = new Architect{
    def write = println("UMLを書きます。")
  }
  //複数のトレイトをミックスインしたインスタンスも作成可能です。
  //T1トレイトとT2トレイトをミックスインして無名クラスでインスタンス化しています。
  val t = new T1 with T2
}