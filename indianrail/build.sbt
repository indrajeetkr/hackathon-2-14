name := """indianrail"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.restfb" % "restfb" % "1.6.14",
  "commons-net" % "commons-net" % "3.2",
  "commons-lang" % "commons-lang" % "2.3"
)
