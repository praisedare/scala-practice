import scala.collection.mutable.ArrayBuffer

abstract class IntQueue:
  def put(x: Int): Unit
  def get(): Option[Int]

class BasicIntQueue extends IntQueue:
  private val q = new ArrayBuffer[Int]

  def put(x: Int) = q += x

  def get() =
    if q.length > 0 then Some(q.remove(0))
    else None

  def length: Int = q.length

trait Doubling extends IntQueue:
  abstract override def put(x: Int) = super.put(x * 2)

class DoubledBasicIntQueue extends BasicIntQueue, Doubling
