package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    // use the type A (generic class); also works for trait
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings  = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // a List of Cat also extends a List of animal?
  // 1. yes! List[Cat] extends List[Animals] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal                    = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION. see line 7 - we'll turn the list of cats into a list of generic animals
  //

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] =
    new InvariantList[Animal] // cannot be cat on the right

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  // generic type needs proper bounded type
  // val newCage = new Cage(new Car) // doesn't run, new cage have to be type of animal

  // exercise package: expand MyList to be generic
}
