```scala
class MyClass(val x: Int) {
  //Removed auxiliary constructor
}
//Always initialize with a value
object Main extends App {
val myInstance = new MyClass(5)
println(myInstance.x) //Prints 5
}
//OR
class MyClass2(val x: Int) {
  def someMethod(): Int = {
    if (x == 0) 0 else x*2 // handle the case where x might be 0
  }
}
object Main2 extends App{
  val myInstance2 = new MyClass2(0) 
  println(myInstance2.someMethod())//Prints 0
  val myInstance3 = new MyClass2(5)
  println(myInstance3.someMethod())//Prints 10
}
```