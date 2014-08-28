package chap6.sect2

import chap6.sect2.bar.Y

/**
 * スコープ指定非公開権限
 * 以下のようにすれば、クラスXはchap6.sect2パッケージ（と、そのサブパッケージ）からは
 * 見えるという意味になります。※Javaのpackageに相当
 */
private[sect2] class X {
  
  //非公開権限（private）
  //このクラスからのみアクセス可能
  private val name:String = "name"
    
  //スコープ指定非公開権限
  //通常のprivateよりも厳しい制限となり、そのインスタンスからのみアクセス可能になります。
  private[this] val age:Int = 19
    
  def print = {
    val x = new X
    println(x.name) //これはOK
    //println(x.age)  これはNG
    println(this.age)//これはOK
    
    (new Y).name//chap6.sect2パッケージからはアクセス可能
  }
}