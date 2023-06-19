object CompositionAndInheritance:
  @main def mn(): Unit =
    println("Loaded")

abstract class Element:
  def contents: Vector[String]

  def height: Int =
    contents.length

  def width: Int =
    if this.height == 0
      then 0
      else contents(0).length

class VectorElement(
  val contents: Vector[String]
) extends Element

class LineElement(
  line: String
) extends VectorElement(Vector(line)):
  override val height = 1
  override def width = line.length

class UniformElement(
  char: Char,
  override val height: Int,
  override val width: Int
) extends Element:
  val contents = Vector.fill(height)(char.toString * width)

