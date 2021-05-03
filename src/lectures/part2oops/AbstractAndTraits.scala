package lectures.part2oops

object AbstractAndTraits extends App {

  abstract class Animal{
    val creatureType:String
    def eat(animal: Animal)
  }
  class dog extends  Animal{
    val creatureType: String = "testing"
    def eat(animal: Animal):Unit=println("Hi")

  }
  trait carnivore{
    val preferredMeal:String="fresh meat"
    def eat :Unit
  }

  class croc extends Animal with carnivore{
    override val creatureType: String = "croc"
    def eat(animal: Animal):Unit=println(s"i am $creatureType abstract method for ${animal.creatureType}")
    def eat:Unit=println(s"i am eating $preferredMeal")
  }

  val t1 = new croc
  val t2 = new dog
  t1 eat t2
  t1.eat

  /*
  Traits and Abstract can have both abstract as well as defined methods
  A class can extend a single abstract class
  A class can extend multiple traits which gives functionality for multiclass inheritance
  A abstract class can have constructor arguements but traits cant have constructor arguements
  for ex:
  abstract class test(x:Int){
    val testing:String=test
  }
  is allowed
  but
  trait class test(x:Int){
    val testing:String=test
  }
  is not allowed
  trait defined the behavior and abstract defines the thing
   */

}
