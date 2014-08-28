package chap6.sect2.foo

import chap6.sect2.bar.Y

class Z extends Y {
  //サブクラスからアクセス可能
  def print = this.name

}