package chap6

//個別インポート
import chap6.foo.bar.MyFoo
//特定のパッケージのすべてのクラスを一括でインポート
//import chap6.foo.bar._

//特定のパッケージのいくつかのクラスを複数指定してインポート
import java.util.{List,Map}//java.util.Listとjava.util.Mapをインポート
//インポートしたクラスに別名を与える
import java.util.{Date => JDate}
//java.sql.DateをSDateとしてインポート、java.sql.Array以外のクラスをすべてインポート
import java.sql.{Date => SDate, Array => _, _}

object Main {

  def main(args: Array[String]): Unit = {
    val mf = new MyFoo("test")
    println(mf.name)
    
    println(new JDate)
  }

}