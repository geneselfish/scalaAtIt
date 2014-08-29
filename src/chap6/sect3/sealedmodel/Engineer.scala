package chap6.sect3.sealedmodel

/**
 * sealedを付けられたクラスは、「同一ファイル内」のクラスからは継承できますが、
 * 別ファイル内で定義されたクラスからは継承できないという特徴を持ちます。
 * ただし、シールドクラスを継承したクラスは、別ファイルのクラスからも継承可能です。
 */
sealed abstract class Engineer {

}

case class Programmer extends Engineer
case class Tester extends Engineer
case class Architect extends Engineer
