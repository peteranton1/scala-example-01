
name := "scala-example-01"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.4"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
