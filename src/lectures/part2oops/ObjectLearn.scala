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
  this pattern of programming is called COMPANION patter.
  This sort of factory pattern provides both instance level
  and class level functionality for a class
   */
  val shweta = new Person
  val jeetu = new Person
  val shubham = Person(shweta,jeetu)
  println(shweta)
  println(jeetu)
  println(shubham)



}
