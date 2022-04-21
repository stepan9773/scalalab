lazy val root = project
  .in(file("."))
  .settings(
    name := "FP2",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.1.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
