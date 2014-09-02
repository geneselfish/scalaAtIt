package chap7.sect2_2

/**
 * Programmerトレイトは、Engineer抽象クラスをスーパークラスに指定しています。
 * これは、「Programmerトレイトをミックスインできるのは、
 * Engineerを継承するクラスだけである」ということを示しています。
 */
trait Programmer extends Engineer {
  println("trait Programmer constructor")
  
  /*
   * もう1つの特徴は「abstract宣言されたメソッドの中でsuperの呼び出しを行っている」ということです。
   * さて、このsuperは何を指しているのでしょうか？ 
   * Engineerを示しているようにも見えますが、Engineerのworkは抽象メソッドです。
   * この時点ではsuper.workは具体的な定義に束縛されていません。
   * トレイト内でsuperを使用した呼び出しを行った場合、メソッドの具体的な定義がしてあるクラスや
   * トレイトの後でミックスインされるのであれば正しく動きます。
   * このトレイトがミックスインされたときにsuper.workの定義内容が動的に束縛されます。
   * このような処理をやっていることをコンパイラに教えるために「abstract override」というキーワードが必要です。
   * この修飾子はトレイトで記述することはできますが、クラスで記述することはできません。
   */
  abstract override def work(time: Int) = {
    println("Programmer#work begin")
    super.work(time - 15)
    println("Programmer#work end")
  }
}