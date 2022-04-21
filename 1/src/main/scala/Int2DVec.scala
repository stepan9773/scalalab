class Int2DVec (val x: Double, val y: Double) {
  def this() = {
    //println("Creating Int2DVec(0,0)")
    this(0, 0)
    println("Creating Int2DVec(0,0)")
  }

  def this(prototype: Int2DVec) = {
    //println("Copy-constructor working")
    this(prototype.x, prototype.y)
    println("Copy-constructor working")
  }

  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  override def toString: String = "( " + this.x + " , " + this.y + " )"
  def -(other: Int2DVec) = new Int2DVec(x - other.x , y - other.y)
  def *(other: Int2DVec): Double = this.x*other.x + this.y*other.y
}
object Int2DVec {
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(vector: Int2DVec) = new Int2DVec( vector.x/(vector * vector) , vector.y / (vector * vector))
}