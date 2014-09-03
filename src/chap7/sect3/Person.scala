package chap7.sect3

/**
 * 順を追って線形化していきましょう。Personの線形化順序は後ろから前に決まっていきます。
 * そのため、線形化の最後はPersonのスーパークラスのEngineerになります。
 * Engineerの線形化は、以下です。
 * Engineer→AnyRef→Any
 * 次に線形化されるのは、最初（Archtectの左側）にミックスインしたDesignerトレイトです。
 * すでにEngineerからの線形化に含まれているクラスは省略されるので、線形化順序は、以下です。
 * Designer→Engineer→AnyRef→Any
 * そして、この前にArchitectの線形化が行われます。ここでも、すでに線形化に含まれているクラスは省略されます。
 * Architect→Programmer→Designer→Engineer→AnyRef→Any
 * 最後に、線形化の先頭はPerson自身になります。
 * Person→Architect→Programmer→Designer→Engineer→AnyRef→Any
 */
class Person extends Engineer with Designer with Architect {

}