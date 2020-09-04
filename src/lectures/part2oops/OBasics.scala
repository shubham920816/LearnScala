package lectures.part2oops

object OBasics extends App{

  val resp=new Person("Shubham",27)
  //println(resp.name) //This would fail because name is field not member
  println(resp.age) //This would be succesful as we have added "val" while declaration

  resp.gretting("Sunny")
  resp.gretting


  val resp2=new Person("John")
  println(resp2.age) //This would be succesful as we have added "val" while declaration

  resp2.gretting("Sunny")
  resp2.gretting
  val writer= new Writer("shubham","mishra",1975)
  println(writer.fullname)
  val novel= new Novel("Lord of the Rings",2010,writer)
  println(novel.authorAge)
  println(novel.isWrittenby(writer))

  val counter=new Counter(33)
  println(counter.currencount)
  val incrstate= counter.increment
  println(incrstate.increment.increment.currencount())
  val dcrstate= counter.decrement
  println(dcrstate.currencount())
  val dcrstateamt= counter.decrement(3)
  println(dcrstateamt.currencount())
  val icrstateamt= counter.increment(4)
  println(icrstateamt.increment(4).currencount())






}

/*
  Defining arguements in the class declaration declares the constructor for that class
  Arguements defined in constructor fields of class but not the member of class i.e you cant access them with
  dot operator outside the class
  For making arguements declared in constructor as class member ,we should use val or var while declaring.
  Fields are accesible inside class by using this operator
  Operator overloading is supported by scala
  We can declare auxilory constructor using this operator but the limitation is that auxilary
  constructor need to call parent(main) constructor
  Auxilory constructors are general used to declare default values thus they are not used
  very frequently
 */
class Person(name:String,val age:Int){
  def gretting(name:String):Unit={
    println(s"My name is $name and my age is $age")
    println(s"My name is ${this.name} and my age is $age")
  }
  def gretting():Unit={
    println("Testing operator overloading")
  }
  def this(name: String)=this(name,46)
}


class Writer(firstname : String ,surname: String, val year: Int){
  def fullname():String={
    s"${this.firstname} ${this.surname}"
  }
}
class Novel(name: String,release: Int,author: Writer){
  def authorAge():Int= {
    if (this.release > this.author.year) this.release - this.author.year
    else 0

  }
  def isWrittenby(author : Writer)={
    author==this.author
  }

  def copy(revisedrelease: Int):Novel={
    new Novel(name,revisedrelease,author)
  }

}
//First Approach
class Counter(counter:Int){

  def currencount():Int=counter
  def increment():Counter=new Counter(counter+1)
  def increment(amount: Int):Counter={
    /*if (amount<=0) this.increment
    else

     */
    new Counter(counter+amount)


  }
  def decrement():Counter=new Counter(counter-1)
  def decrement(amount: Int):Counter=new Counter(counter-amount)

}

// Second Approach

class Counter2(val counter: Int =0 ) {
  def inc:Counter2={
    print("incrementing")
    new Counter2(counter+1)
  }
  def dcr: Counter2 ={
    print("decrementing")
    new Counter2(counter-1)
  }
  def inc(n:Int):Counter2={
    if (n<=0) this
    else inc.inc(n-1)

  }
  def dcr(n:Int):Counter2={
    if (n<=0) this
    else dcr.dcr(n-1)

  }
  def print:Int=counter


}