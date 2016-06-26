// Turn this project into a Scala.js project by importing these settings

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)
workbenchSettings

name := "scaladays2016-smalldata"
version := "0.0"

scalaVersion := "2.11.8"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
libraryDependencies += "com.github.pathikrit" %% "better-files" % "2.16.0"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.5.5"
libraryDependencies += "eu.unicredit" %%% "paths-scala-js" % "0.4.4"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

jsDependencies += "org.webjars" % "jquery" % "3.0.0" / "3.0.0/jquery.js"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)
// Workbench has to know how to restart your application.
bootSnippet := "scala.amsterdam.SmallDataJs().main();"