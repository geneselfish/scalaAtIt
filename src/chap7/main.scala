package chap7

object main extends App {
  val p = new Person("Yoko-chan") with Designer
  p.design
  p.coding
}