name := "learning-akka"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

  //akka
    "com.typesafe.akka" %% "akka-actor" % "2.5.12",
    "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % Test
)