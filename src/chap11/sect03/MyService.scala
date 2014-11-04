package chap11.sect03

trait MyService {
  def findAll(): String
}

trait MyServiceImpl extends MyService {
    def findAll(): String = "MyServiceImpl#findAll"
}