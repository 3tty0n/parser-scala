lazy val commonSettings = Seq(
  name := """parser-scala""" ,
  version := "1.0",
  scalaVersion := "2.12.0",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
  )
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
