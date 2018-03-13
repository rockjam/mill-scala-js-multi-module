import shared._

object Main extends App {
  val result = Shared.add(1, 2)
  println(s"${sys.props("java.vm.name")} result is: ${result}")

  def addTwice(a: Int, b: Int) = Shared.add(a,b) + Shared.add(a,b)
}
