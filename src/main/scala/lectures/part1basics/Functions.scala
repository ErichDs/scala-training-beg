package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  // println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
    1. A greeting function (name, age) +> "Hi, my name is $name and I am $age years old"
    2. Factorial function: 1 * 2 * 3 * .. * n
    3. A fibonacci function: f(1) = 1, f(2) = 1, f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime.
   */

  // 1.
  def aGreetingFunction(aName: String, aAge: Int): Unit = {
    println("Hi, my name is " + aName + " and I am " + aAge + " years old.")
  }

  aGreetingFunction("Erich", 29)

  // 2.
  def aFactorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(5))

  // 3.
  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(8))

  // 3.
  def IsPrimeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(IsPrimeNumber(37))
  println(IsPrimeNumber(36))

}
