import Int2DVec.unitVectorOf
import java.io._
object Main extends App {



    println("Hello: World \n ")

    val janek = new Person("1234567890" , "Jan", "Kowalski")
    /*println(janek.getName())
    //println(janek.id)
    janek.surname = "Kowal"
    println(janek.getName())*/

    val v1 = Int2DVec(1, 2)
    val v2 = Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    println(v3)
    println(v4)
    println(Int2DVec())
    println(Int2DVec(v1 + v1 + v2))

    print(unitVectorOf(v4))

}


object Hello extends App {
  if (args.length == 1)
    println(s"Hello, ${args(0)}")
  else
    println("I didn't get your name.")
}
