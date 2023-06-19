object Main:
  @main def mn() =
    println("Loaded") 

class Rational(n: Int, d: Int):
  require (d != 0)

  val num = n
  val denum = d

  def this(n: Int) =
    this(n, 1)
    // println("Invoking aux ctor with 1 arg")

  override def toString = s"Rational ($n/$d)"

  def + (other: Rational): Rational = add(other)
  def add(other: Rational): Rational = 
    Rational(this.n * other.denum + other.num * this.denum, this.denum * other.denum)
  def + (other: Int): Rational = add(other)
  def add(other: Int): Rational =
    Rational(d * other + n, d)

extension (x: Int)
  def + (num: Rational): Rational =
      Rational(x) + num

