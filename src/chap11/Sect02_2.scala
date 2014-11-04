package chap11

/**
 * typeキーワードは別名を付けるだけではなく、型名を指定せずに
 * 「特定のシグネチャの関数を持つ」型を定義できます。そして、コンパイル時に
 * 「特定のシグネチャの関数を持つ」型が渡されているかどうかチェックしてくれます。
 */
object Sect02_2 {

  def main(args: Array[String]): Unit = {
    //func関数にFileIOとDatabaseIOを渡してみます。2つのクラスに継承関係はありませんが、
    //どちらも問題なく渡せます。
    func(new FileIO, "test.txt")
    func(new DatabaseIO, "databaseUrl")
  }
  
  /**
   * typeキーワードを使ってIO型を定義します。
   * IO型は「String型の引数を1つとり、Boolean型を返す『open』という名前の関数」と
   * 「引数、戻り値なしの『close』という名前の関数」を持つ構造的部分型として定義されています。
   * この2つの関数を持っていれば、IO型の派生型として使えます。
   */
  type IO = {
    def open(src: String): Boolean
    def close: Unit
  }
  
  /**
   * このIO型を受け取る関数を定義します。
   */
  def func(io: IO, src: String) {
    io.open(src)
    println("func execute")
    io.close
  }
}

/**
 * func関数に渡すクラスを定義。
 * IO型の派生型と見なされるために。openメソッドとcloseメソッドを定義。
 */
class FileIO {
    def open(src:String):Boolean = {println(src + " file open"); true}
    def close:Unit = println("file close")
}

class DatabaseIO {
    def open(url:String):Boolean = { println(url + " connection open"); true }
    def close = println("connection close")
}