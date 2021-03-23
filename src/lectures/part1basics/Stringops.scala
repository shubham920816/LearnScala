package lectures.part1basics

object Stringops extends App{

  val str:String = "Hello world,i am learning scala"
  println(str.charAt(2))
  println(str.length)
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase)
  println(str.substring(7,11))

  val str2: String="42"
  val intVal: Int=str2.toInt
  println(str.reverse)
  println(str.take(5))
  println("a" +: str2 :+ "z")

  // Scala Specific Interpolation
  //s-interpolation
  val name: String="shubham"
  val age: Int=12
  val sent : String=s"My name is $name and my age is $age"
  val sent2: String= s"My name is $name and i am turning ${age +1}"
  println(sent)
  println(sent2)

  //f-interpolation
  val rate: Float = 1.2f
  val sent3: String =f"My name is ${name+"mishra"}%s and i can eat ${rate+1}%2.2f "
  println(sent3)

  //raw-interpolation
  val sent4: String=raw"Hello \n test"
  val sent5: String="Hello testing \n newline"
  val sent6: String=raw"$sent5"
  println(sent4)
  println(sent6)






}
