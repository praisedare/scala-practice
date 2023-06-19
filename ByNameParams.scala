object ByNameParameters:
  @main def mn(): Unit =
    assertByName(10 / 0 == 8) // Won't throw an error
    // assertByBool(20 < 2) // But this will

var testMode = false

def assertFunc(bool: Boolean) =
  if (testMode && !bool) then
    throw new AssertionError("Precondition failed")

def assertByName(predicate: => Boolean): Unit =
  assertFunc(predicate)

def assertByBool(bool: Boolean): Unit =
  assertFunc(bool)

