package lectures.part1basics

object CBNvsCBV extends App{
  def CBV(x:Long):Unit ={
    println("by value"+x)
    println("by value "+x)
  }

  def CBN (x: => Long): Unit={
    println("by name"+x)
    println("by name "+x)


  }
  CBV(System.nanoTime())
  CBN(System.nanoTime())

  /*
  Call by Value - We use generally this approach,in this approach arguments are
  first calculated and then passed to the function body.
  Call by Name - This approach is differentiated by (=>) and in this approach ,arguements
  are passed to the function body without calculating them first hand
   */
  def infinite_loop():Int=1+infinite_loop()
  def display(x: Int,y : => Int):Unit = println(x)
  display(34,infinite_loop())
  display(infinite_loop(),34)


}
