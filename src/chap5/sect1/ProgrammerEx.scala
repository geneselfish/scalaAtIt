package chap5.sect1

//import chap5.sect1.PgmrA
//import chap5.sect1.Programmer

object ProgrammerEx {

  def main(args: Array[String]): Unit = {
    val pg1 = new Programmer
    pg1.coding
    pg1.language = "F#"
    pg1.coding
    
    val pg2 = new Programmer("Java")
    pg2.coding
    
    val pga = new PgmrA
    pga.coding
    //pga.language = ""
    println(pga.language + "を使ってコーディングします。")
    
  }

}