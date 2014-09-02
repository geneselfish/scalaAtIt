package chap7.sect2_2

trait Agiler extends Engineer {
  println("trait Agiler constructor")

  abstract override def work(time: Int) = {
    println("Agiler#work begin")
    super.work(time / 2)
    println("Agiler#work end")
  }
}