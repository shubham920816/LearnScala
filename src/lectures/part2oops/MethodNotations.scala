package lectures.part2oops
import scala.language.postfixOps

object MethodNotations extends App{

  class Person(val name: String, favroutimovie : String){
    def likes(movie : String):Boolean= movie == favroutimovie
    def hangsouthwith(person : Person):String=s"${this.name} hangs out with ${person.name}"
    def +(person : Person):String=s"${this.name} hangs out with ${person.name}"
    def unary_! : String = s"${this.name} what the heck ?"
    def isalive : Boolean = true
    def apply() : String = s"Hi ! my name is ${this.name} and my favourite movie is ${this.favroutimovie}"
  }
  val hary= new Person("hary","border")
  println(hary.likes("border"))
  val tom=new Person("tom","inception")
  println(hary.hangsouthwith(tom))
  println(hary hangsouthwith tom) //equivalent to above statement
  /*
  inline notation = operator notation (if we define method with only single arguement
                                       we can use the methods as inline notations)
  "operators" in scala
  There is no boundation on using keywords in methodnames ,you can use +,& etc.
  All the numeric operators are methods in scala ,so you can use them with dot operator

   */
   println( 1 + 2)
   println(1.+(2)) //ALL Operators are methods

  /*
  Prefix notation
      This notation are used with unary operators and are allowed
      for 4 operators that are -,+,!,~
   */
  val x= -1
  val y= 1.unary_- //both are equivalent
  println(!tom)
  /*
  Post Fix notation
     This operators are used with the methods which dont take any arguement
   */
  println(tom isalive)

  /*
  Apply() method
     Whenever we call a class object as method ,compiler looks for the method named apply and
     executes it

   */
  println(tom.apply())
  println(tom()) //equivalent

  /*
  All the above notations namely inline,prefix,postfix and apply are part of
  "syntactic sugar" provided by scala.Role of syntactic sugar is to relate programming
  language to natural language
   */
}
