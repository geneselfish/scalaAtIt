package chap5_3_1

object Main1 extends App {

  //「Option」型とは
  val m = Map("Scala"->1, "Java"->2)
  m.get("Scala")
  // res0: Option[Int] = Some(1)
  m.get("Curl")
  // res1: Option[Int] = None
  
  m.get("Scala").get
  // res2: Int = 1
  //m.get("Curl").get
  // java.util.NoSuchElementException: None.get
  //      ......
  
  m.get("Java").getOrElse(0)
  //res4: Int = 2
  m.get("Curl").getOrElse(0)
  //res5: Int = 0
  
  def testMatch(opt:Option[Int]):Unit = {
    opt match {
      case Some(n) => println(n)
      case None    => println("None!")
    }
  }
  testMatch(m.get("Scala"))
  testMatch(m.get("Curl"))
  
  
}