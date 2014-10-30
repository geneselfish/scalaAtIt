package chap10.sect02

import scala.actors.Actor

/**
 * Scala標準のアクターを使用するには、scala.actors.Actorクラスを継承し、actメソッドを実装します。
 */
class MyActor extends Actor {
  def act = println("Hello MyActor")
}