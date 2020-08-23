package lectures.basicspar1

object LearnFunction extends App{

  def Firstfunction(x: String, y: Int): String={
    x + " " + y
  }
  def functionwitharguements():Int=56
  println(Firstfunction("hello",6))
  println(functionwitharguements())
  println(functionwitharguements) //We can call function with no arguments with parenthesis

  def repeatfunction(x:String,y:Int):String=
    {
      if (y<=1) x
      else x+repeatfunction(x,y-1)

    }
  println(repeatfunction("hello",3))
  // Scala ide adds a identifier ("@") when the function is recursive
  // WHENEVER WE NEED FOR LOOP IN SCALA,WE SHOULD USE RECURSION
  // Defining Return type of a normal function is not mandatory as scala tries to infer it
  // but for recursive functions return type is must .
  // We can define return type as unit for function which gives side effects .


}
