package lectures.part2oop

import playground.{PrinceCharming, Cinderella => Princess}

import java.sql
import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  // Package members are accessible by their simple name
  val write = new Writer("Erich", "LearningScala", 2022)

  // import the package
  val princess = new Princess // playground.Cinderella = fully qualified name

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use FQ name
  val date = new Date
//  val sqlDate = new java.sql.Date(2018, 5, 4)
  val sqlDate = new SqlDate(2018, 5, 4)
  // 2. aliasing

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???

}
