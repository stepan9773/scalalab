import scala.language.strictEquality

/**
  * Multiversal Equality: https://dotty.epfl.ch/docs/reference/contextual/multiversal-equality.html
  * scala.CanEqual definition: https://github.com/lampepfl/dotty/blob/master/library/src/scala/CanEqual.scala
  */
object MultiversalEquality:

  def test(): Unit =

    // unless we add the derived delegate instance like:
    given CanEqual[Int, String] = CanEqual.derived
    println(3 == "3")


    // given canEqualNumber as CanEqual[Number, Number] = derived
    println(3 == 5.1)

    // By default, all Sequences are comparable, because of;
    // given canEqualSeq[T, U](using eq: CanEqual[T, U]) as CanEqual[Seq[T], Seq[U]] = derived
    println(List(1, 2) == Vector(1, 2))

    class A(a: Int)
    class B(b: Int)

    val a = A(4)
    val b = B(4)


    // to compare instances of A and B.
    given CanEqual[A, B] = CanEqual.derived
    given CanEqual[B, A] = CanEqual.derived

    println(a != b)
    println(b == a)

