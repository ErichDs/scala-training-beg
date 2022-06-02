package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    // def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String          = s"$name, what the heck?!"
    def isAlive: Boolean          = true
    def apply(): String           = s"Hi, my name is $name and I like $favoriteMovie"
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

}
