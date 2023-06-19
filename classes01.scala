object App:
  @main def main(args: String*) =
    val joe = Person("Joe", 39)
    joe.name should.be("Joe")
    println(joe)


case class Person(name: String, age: Int)

