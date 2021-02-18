enablePlugins(ScalaJSPlugin)

name := "sttp-node"
scalaVersion := "2.13.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "com.softwaremill.sttp.client3" %%% "core" % "3.1.2"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()
