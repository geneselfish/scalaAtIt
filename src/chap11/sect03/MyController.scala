package chap11.sect03

class MyController {
  self: MyService =>
    
  def execute = {
    println(findAll())
  }
}