class Person(protected val id: String , val givenName: String , var surname: String) {
  def getName(): String ={
    this.givenName + " " + this.surname
  }
}

class C1(var a1: String, val a2: Int, private val a3: Double)
