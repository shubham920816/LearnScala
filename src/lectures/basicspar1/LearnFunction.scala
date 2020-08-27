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

  def bigfunction(x: Int) = {
    def smallfunction()= x+2   // Auxiliary function declaration
    smallfunction()
  }
  println(bigfunction(5))

  // Assignments
  //1.Greet Function - greetfunction(name,age)-"Hello my name is $name and my age $age"
  //2.factorial
  //3.Fibonacci
  //isprimenumber


  def greetfunction(name : String , age: Int) : String ={
    "Hi my name is " + name + " and my age is "+age
  }
  println(greetfunction("shubham",27))

  def factorial(x: Int) : Int={
    if (x==1) x
    else x*factorial(x-1)

  }
  println(factorial(4))

  def fibbonacci(x: Int) : Int={
    val a=1
    if ((x==1) | (x==2) ) a
    else fibbonacci(x-1) + fibbonacci(x-2)
  }
  println(fibbonacci(6))

  def isprime(n: Int): Boolean={
    def checkprime(t:Int):Boolean= {

      if (t <= 1) true
      else n%t!=0 && checkprime(t-1)

    }
    checkprime(n-1)

  }
  println(isprime(4))


}
