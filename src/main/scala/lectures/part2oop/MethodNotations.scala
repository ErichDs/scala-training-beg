package lectures.part2oop
import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    // def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String   = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String            = s"$name, what the heck?!"
    def unary_+ : Person            = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean            = true
    def apply(): String             = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String       = s"$name watched $favoriteMovie $n times"
    def learns(thing: String)       = s"$name is learning $thing"
    def learnsScala                 = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar) (works only with methods with a single 1 parameter)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  // println(mary hangOutWith tom)
  println(mary + tom) // its possible to name methods with operators (e.g.: +)
  println(mary.+(tom))
  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // unary operators. equivalent 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)
  // equivalent!

  // postfix notation
  println(mary.isAlive)
  //println(mary isAlive) // this syntax needs to have scala.language.postfixOps imported or
  // set the compiler option -language:postfixOps

  // apply
  println(mary.apply())
  println(mary()) // equivalent

  /* exercises:
    1. Overload the + operator
      - mary + "the rockstar" => new person "Mary (the rockstar)"

    2. Add an age to the Pperson class.
      - add an unary + operator => new person with the age + 1
      +mary => mary with the age incrementer

    3. Add a "learns" method in the Person class => "Mary learns Scala"
       Add a leansScala method, calls learns method with "Scala
       Use it in postfix notation.

    4. Overload the apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */

  // 1.
  println((mary + "the Rockstar")())
  //println((mary + "the Rockstar").apply())

  // 2.
  println((+mary).age)

  // 3.
  println(mary learnsScala)

  //4.
  println(mary(10))
}
