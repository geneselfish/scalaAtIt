package chap7.sect2_2

class Person extends Engineer {
  println("class Person constructor")

  def work(time: Int) = {
    println("Person#work begin")
    println("1つのタスクを" + time + "分で行います")
    println("Person#work end")
  }
}