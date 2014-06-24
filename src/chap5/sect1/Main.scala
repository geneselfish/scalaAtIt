package chap5.sect1

//import chap5.Programmer

object Main extends App {

  val pg1 = new Programmer
  pg1.coding
  
  val pg2 = new Programmer("Java")
  pg2.coding
  
  val pg3 = new Programmer(language = "Curl")
  pg3.coding
}