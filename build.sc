import mill._, scalalib._, scalajslib._

trait BaseModule extends ScalaJSModule {
  def scalaVersion = "2.12.4"
  def scalaJSVersion = "0.6.22"
}

object client extends BaseModule {
  def moduleDeps = Seq(shared)
  def mainClass = Some("Main")
  object test extends Tests {
    def testFrameworks = Seq("utest.runner.Framework")
    def ivyDeps = Agg(ivy"com.lihaoyi::utest::0.6.3")
  }
}

object shared extends BaseModule
