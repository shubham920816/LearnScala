package lectures.part2oops


object ObjectLearn extends  App {
  /* Object method are used for defining class level
  functionality i.e static in scala as scala does not
  have class level functionality
   */
  object Person {
    /*
    Objects are Singleton Pattern in Scala i.e Object defines the type as
    well as the only instance of the class
     */
    val test :Int=2
    def test_function(x:Int,y:String):String={
      val value_test = s"y$x"
      value_test
    }
    /*
    This sort of pattern is factory pattern where
    we use the Person instances  to create a new instance
    of class
     */
    def apply(x:Person,y:Person): Person = new Person()
  }
  val mary=Person
  val John=Person
  println(mary == John)
  /*
  As Person is the one and only instance of Person Object
  thus john and mary are point to same instance in case of
  object declaration
   */
  class Person{
    def testing(x:Int): Unit ={
      println(s"$x")
    }
  }
  /*
  If we define Object and Class with same name
  this pattern of programming is called COMPANION pattern.
  Companion can access each others private members
  This sort of factory pattern provides both instance level
  and class level functionality for a class
   */
  val shweta = new Person
  val jeetu = new Person
  val shubham = Person(shweta,jeetu)
  println(shweta)
  println(jeetu)
  println(shubham)
  /*
  We use "extends App" in scala Objects to run them as application because
  scala application are special scala objects with
  def main(args :Array[String]): Unit
  Scala Applications are converted to Java virtual machine
  application whose entry point is public static void main.
  In case of scala ,void is equivalent to unit
  and as this is object ,all methods inside are static
  methods
   */


}

/*
Below is implementation of Running Object without Extends App method

object ObjectLearn  {

  object Person {

    val test :Int=2
    def test_function(x:Int,y:String):String={
      val value_test = s"y$x"
      value_test
    }

    def apply(x:Person,y:Person): Person = new Person()
  }
  val mary=Person
  val John=Person
  println(mary == John)

  class Person{
    def testing(x:Int): Unit ={
      println(s"$x")
    }
  }

  def main(args : Array[String]):Unit={
    val shweta = new Person
    val jeetu = new Person
    val shubham = Person (shweta, jeetu)
    println (shweta)
    println (jeetu)
    println (shubham)
  }

}
 */