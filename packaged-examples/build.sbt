
organization := "scalafromwhy3"

name := "packaged-examples"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.1"

resolvers += Resolver.sonatypeRepo("public")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.0" % "test"

