/**
  * Parameter Untupling: https://dotty.epfl.ch/docs/reference/other-new-features/parameter-untupling.html
  */
object ParameterUntupling:

  def test(): Unit =
    val xs: List[String] = List("d", "o", "t", "t", "y")

    xs.zipWithIndex.map((s, i) => println(s"$i: $s"))

