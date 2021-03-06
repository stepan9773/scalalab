import scala.language.implicitConversions

/**
  * Conversions: https://dotty.epfl.ch/docs/reference/contextual/conversions.html
  */
object Conversion:

  case class IntWrapper(a: Int) extends AnyVal
  case class DoubleWrapper(b: Double) extends AnyVal

  def convert[T, U](x: T)(using converter: Conversion[T, U]): U = converter(x)

  given IntWrapperToDoubleWrapper: Conversion[IntWrapper, DoubleWrapper] = new Conversion[IntWrapper, DoubleWrapper] {
    override def apply(i: IntWrapper): DoubleWrapper = DoubleWrapper(i.a.toDouble)
  }

  def useConversion(using f: Conversion[IntWrapper, DoubleWrapper]) =
    val y: IntWrapper = IntWrapper(4)
    val x: DoubleWrapper = y
    x


  def test(): Unit =
    println(useConversion)
    println(convert(IntWrapper(42)))
