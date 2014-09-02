package chap7.sect2_2

object Main extends App {
  //workメソッドを呼ぶと、Programmerトレイトのworkメソッドが呼ばれ、
  //その後にPersonクラスのworkが実行されていることが分かります。
  val p = new Person with Programmer
  p.work(60)
/*
class Engineer constructor
class Person constructor
trait Programmer constructor
Programmer#work begin
Person#work begin
1つのタスクを45分で行います
Person#work end
Programmer#work end
*/
  println("")
  
  //トレイトで重要な指定順序
  val pa = new Person with Programmer with Agiler
  pa.work(60)
/*
class Engineer constructor
class Person constructor
trait Programmer constructor
trait Agiler constructor
Agiler#work begin
Programmer#work begin
Person#work begin
1つのタスクを15分で行います
Person#work end
Programmer#work end
Agiler#work end
*/
  println("")
  
  val ap = new Person with Agiler with Programmer
  ap.work(60)
/*
class Engineer constructor
class Person constructor
trait Agiler constructor
trait Programmer constructor
Programmer#work begin
Agiler#work begin
Person#work begin
1つのタスクを22分で行います
Person#work end
Agiler#work end
Programmer#work end
 */
}