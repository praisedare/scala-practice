object Main:
  @main def mn() =
    val sum = foldCustom(0)(List(1,2,3,4)){ (a, b) => a + b }
    println(s"Sum is $sum")

def foldCustom[B](initialValue: B)(list: List[B])(summator: (B, B) => B): B =
  val runner = (currSum: B, remainingList: List[B]): B =>
    remainingList match {
      case Nil => currSum
      case topmostItem :: rest => runner(
          summator(topmostItem, currSum),
          rest
        )
    }

  runner(initialValue, list)

