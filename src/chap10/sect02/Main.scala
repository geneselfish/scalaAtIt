package chap10.sect02

import scala.actors.Actor._

object Main {

  def main(args: Array[String]): Unit = {
    //定義したアクターを開始してみましょう。MyActorをインスタンス化してstartメソッドを実行します。
    (new MyActor).start
    
    //また、scala.actors.Actorのファクトリメソッドを使用してアクターを直接生成する方法もあります。
    //この場合、startメソッドを呼ばなくてもそのままアクターが開始されます。
    actor {
      println("Hello MyActor for factory")
    }
  }

}