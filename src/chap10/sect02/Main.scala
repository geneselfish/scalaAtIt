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
    
    /*
     * メッセージパッシング.
     * receive
     */
    val myActor = actor {
      val result = receive {
        case i:Int =>
          println("receive = %d".format(i))
          "Int:%d".format(i)
      }
      println("result = %s".format(result))
    }
    //「!」メソッドを使ってメッセージを送信します。
    //myActorはInt型のみを待っているので、これ↓では反応なし。
    myActor ! "xyz"
    //これ↓には反応する。
    myActor ! 1 // myActor.!(1)
    //myActorへのメッセージ送信を2回以上行っても、何も反応がない。
    //これは、アクターの受信を繰り返すようになっていないため。
    myActor ! 100
    Thread.sleep(1000)
    //myActor.restartメソッドを実行すればアクターが再起動され、メールボックス内のメッセージが1件処理されます。
    myActor.restart
    
    /*
     * メッセージを送るたびにrestartを呼ぶのは面倒なので、受信を続けるようにしましょう。
     * 受信を続けるようにするには、loopを使用します。
     */
    //また、receiveの代わりにreactを使うと、結果を返せませんが、より高速に動作します。
    val myActor2 = actor {
      loop {
        react {
          case i:Int => println("loop react = %d".format(i))
        }
      }
    }
    myActor2 ! 1
    myActor2 ! 2
    
    /*
     * また、replyメソッドを使用すれば、メッセージを受け取って送信元へ返信することもできます。
     */
    val myActor3 = actor {
      loop {
        react {
          case i:Int =>
            val rep = i + 1
            println("react = %d and reply = %d".format(i, rep))
            reply(rep)
        }
      }
    }
    //同期メッセージ（!?）を送り、reply結果を受け取ってみましょう。myActorに渡した数値がインクリメントされた結果を受け取れます。
    val x = myActor3 !? 10
    println(x)
    /*
     * 「!!」というメソッドでメッセージを送ってみましょう。これは非同期でメッセージを送信し、
     * 返信を受け取るためのFutureオブジェクトを返します。返されたFutureオブジェクトのapply()メソッドを
     * 呼べば返信を取得できます。
     * なおapply()メソッドは、返信が返ってくるまで処理をブロックするので、
     * メッセージを送信してから返信が返ってくるまでに別の処理を行いたい場合に便利です。
     * また、このメソッドはコールバック関数を渡して処理を行うことできます。
     */
    myActor3 !! (11,{case i:Int => println("result callback = %d".format(i))})
  }
  
}