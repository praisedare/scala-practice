import scala.io.StdIn.readLine

object ReadingInputLoop:
  @main def mn() = {}

def scanDirForScalaFiles() =
  val files = java.io.File(".").listFiles
  for
    file <- files
    name = file.getName
    if name.endsWith(".scala")
  do {
    println(s"file: $name")
  }

def readLineLoop =
  var shouldLoop = true
  while shouldLoop do
    val line = readLine("Enter some text: ")
    val lineIsEmpty = line.trim.isEmpty
    val msg = if !lineIsEmpty
                then line
                else "~~nothing~~. Why did you do that? Now this all has to end!" 
    println(s"You entered: ${msg}")
    if (line.trim.length == 0)
      shouldLoop = false

