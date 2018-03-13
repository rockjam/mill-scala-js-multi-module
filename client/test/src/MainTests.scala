import utest._

object MainTests extends TestSuite {
  def tests: Tests = Tests {
    'one - {
       val result = Main.addTwice(1, 2)
       assert(
         result == 6
       )
    }
  }
}
