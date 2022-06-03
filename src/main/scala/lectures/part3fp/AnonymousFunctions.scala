package lectures.part3fp

object AnonymousFunctions extends App {

  // anonymous function (LAMBDA)
  val doubler: Int => Int = x => x * 2
  // val doubler = (x: Int) => x * 2

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething)   // function itself
  println(justDoSomething()) // actual call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int  = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ //equivalent to  (a, b) => a + b

  /*
    1. MyList: Replace all FunctionsX calls with lambdas
    2. Rewrite the "special" adder as anonymous function
   */

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
