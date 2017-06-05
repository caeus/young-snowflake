import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "science.caeus",
      scalaVersion := "2.12.2",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies ++= Seq(scalaTest % Test,
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6"
    )
  )
