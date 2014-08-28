package chap6.sect2.bar

class Y {
  //スコープ指定限定公開権限は、スコープ指定非公開権限にサブクラスからの
  //アクセスも許可した権限です。
  //これは、アクセス対象を抱合したパッケージかクラス／オブジェクトを指定できます。
  //class X,Z参照
  protected[sect2] val name = "name"

}