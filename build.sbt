
name := "scala-example-01"

version := "0.1"

scalaVersion := "2.11.12"

val Http4sVersion = "0.18.8"
val LogbackVersion = "1.2.3"
val sparkVersion = "2.4.4"

scalacOptions += "-Xfatal-warnings"
resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s" %% "http4s-dsl" % Http4sVersion,
  "ch.qos.logback" % "logback-classic" % LogbackVersion
)
