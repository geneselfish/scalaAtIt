object PtnMatch1 {

  def main(args: Array[String]): Unit = {
    val x:Any = "hello"
    val res = x match {
      case i:Int =>
        println("x =22" + i.toString())
        1
      case s:String =>
        println("x =" + s)
        2
      case _ =>
        println("other")
        3
    }
    println("res = " + res.toString())
  }

}