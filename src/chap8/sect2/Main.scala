package chap8.sect2

object Main {
  def main(args: Array[String]): Unit = {
    //標準ではFoo[Base]型に代入できるのはFoo[Base]型だけです。
    //invariant(new Foo[Ex]) → コンパイルエラー
    
    //今度はFoo[Base]型にFoo[Ex]を渡すことができました。Foo[Base]型には、
    //型パラメータにBasaまたはBaseのサブクラスが指定されたFoo型を代入できます。
    covariant(new Bar[Ex])
    
    //そしてもう1つ、「反変」という指定もあります。これは共変の逆で、
    //「型パラメータに指定した型のスーパークラスを指定した型」が代入可能です
    contravariant(new Baz[Base])
  }

  def invariant(arg:Foo[Base]) = println("ok")
  def covariant(arg:Bar[Base]) = println("ok")
  def contravariant(arg:Baz[Ex]) = println("ok")
}

/**
 * 何も指定しないデフォルトの型パラメータ指定を「非変」といいます。
 */
class Foo[T]

/**
 * 型パラメータを指定する個所で、「+」を付けて定義します。
 * この指定を「共変」といいます。
 */
class Bar[+T]

/** 反変 */
class Baz[-T]