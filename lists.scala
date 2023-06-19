@main def m = {
  val fruits = List("banana", "mango", "apple")
  fruits.foreach(f => println(s"I love ${f}s"))

  val jake = Person("jake")
}

class Person(var name: String):
  val initialName = name
  println("New person instantiated")

  def changeName(newName: String):
    name = newName

