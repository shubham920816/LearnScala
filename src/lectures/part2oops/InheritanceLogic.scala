package lectures.part2oops

import lectures.part2oops.ObjectLearn.Person

object InheritanceLogic extends  App{
//Scala only allows one level inheritance
  class Animal{
    def testing(x:Int,y:String):String={
      return y
    }
  }
  class Pets extends Animal{
    def mustTesting(x:Int,p:String):Int={
      val t = testing(x,p)
      println(t)
      return x
    }
  }

  val value = new Pets
  value.mustTesting(3,"Shubham")

  //Constructor
  class Person(x:Int,y:Int){
    val typeData="test"
  }
  class human(x:Int,y:Int,z:String) extends  Person(x,y)

  //Overriding
  class domesticPets extends  Pets {
    override def mustTesting(x:Int,y:String):Int ={
      return x+2
    }
  }
 val t1 = new domesticPets
  println(t1.mustTesting(2,"test"))

  // Calling parent class overriden methods in child class
  class wildPets extends  Pets {
    override def mustTesting(x:Int,y:String):Int ={
      println(super.mustTesting(x,y))
      return x+2
    }
  }

  val t2 = new wildPets
  println(t2.mustTesting(5,"shubham"))
}

/* Preventing Override
1.user final with methdods ,variable or the whole class which will stop the inheritance
of the class,member or variable .
ex:
class Animal{
    final def testing(x:Int,y:String):String={
      return y
    }
  }
2.use seal method in front of class ,
this will allow inheritance in the same file but will stop inheritance/extension
in other files


 */
