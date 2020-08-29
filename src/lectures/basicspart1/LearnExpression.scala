package lectures.basicspart1

object LearnExpression extends App{

  val x: Int= 23   // val are immutable object in Scala
  var y: String= "Hello word" // var are used for declaring variables in scala
  println(y)
  val codeblock={          // codeblocks have same return type as the last executed line of the                            / code
    val p: Int=34          // code block .
    val z: Int = p+1
    if (z>2) "Test pass" else "test failes"

  }
  println(codeblock)
  val test=println("Unit Type testing")  // every statement in scala is a expression instead of instruction
                                         // Sideeffects are also considered as expression in scala with returntype
                                         // as "Unit"
  println("Typing datatype of sideffect")
  println(test)


}
