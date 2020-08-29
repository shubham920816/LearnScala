package lectures.basicspart1

import scala.annotation.tailrec

object LearnRecursion extends App{
  /*
  Below function is normal recursion
   */
  def factorial(x:Int):BigInt={
    if (x<=1) 1
    else x*factorial(x-1)
  }
  println(factorial(20))
 /*
  for each recursion calls,jvm allocates a stack frame
  and if the number of recursion calls increases,jvm
  runs out of stack frames and which leads to stack overflow
  error
  */

  /*
  Below function is based on Tail recursion
   */
  def anotherfactorial(x:Int):BigInt={

    @tailrec
    def facthelp(x:Int, accum:BigInt):BigInt= {
      if (x <= 1) accum
      else facthelp(x - 1, x * accum)
    }
    facthelp(x,1)

    }
  println(anotherfactorial(5))
  /*
  In case of tailed recursion ,last call in the function is the
  direct call to the function itself,this insures that JVM doesnt allocate
  new stack frame for every call.Instead JVM replaces the stack frame post every
  recursive call
  Hint:
  For converting a recursive method to tail recursive ,we should use accum as shown above the times
  code path is sent in recursive calls
   */
  /*
  Exercises

  1.Create a tail recursive method to concat string n times
  2.Create a tail recursive method for checking prime numbers
  3.Create a tail recursive method for Fibonacci series
   */

  def concatestring(x:String,n:Int):String={
    @tailrec
    def concat_help(y:Int,accum:String):String= {
      if (y <= 1) accum
      else concat_help(y - 1,accum+x)
    }
    concat_help(n,x)
  }
  println(concatestring("Shubham",5))

  def checkprime(x:Int):Boolean={
    @tailrec
    def isprime (t:Int,isstillprime:Boolean):Boolean={
      if (! isstillprime) false
      else if (t<=1) true
      else isprime(t-1,x%t!=0 && isstillprime)
    }
    isprime(x-1,true)

  }
  println(checkprime(2003))

  def anotherfibonnaci(n:Int) : BigInt = {
    @tailrec
    def fibbonac_help(x: Int, last: BigInt, nexttolast: BigInt): BigInt = {
      if (x >= n) last
      else fibbonac_help(x + 1, last + nexttolast, last)
    }

    if (n <= 2) 1
    else fibbonac_help(2, 1, 1)
    }
  println(anotherfibonnaci(8))


  }


