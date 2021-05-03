package excercise

abstract class MyList {

  def head:Int
  def tail:MyList
  def isEmpty:Boolean
  def add(element:Int):MyList
  def printElements:String
  override def toString:String = "["+printElements+"]"


}

object Empty extends MyList {
  def head = throw new NoSuchElementException

  def tail = throw new NoSuchElementException

  def isEmpty = true

  def add(element:Int)=new Cons(element,Empty)

  override def printElements: String = ""

}
class Cons(h:Int,t:MyList) extends MyList{
  def head= h
  def tail = t
  def isEmpty=false
  def add(element: Int) = new Cons(element,this)

  override def printElements: String = {
    if (t.isEmpty) " "+ h
    else h + " " + t.printElements
  }
}