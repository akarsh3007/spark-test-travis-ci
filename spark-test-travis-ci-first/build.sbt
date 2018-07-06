name := "spark-test-travis-ci"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val sparkVersion = "2.3.0"

  Seq(
    // Apache Spark
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,

    // Databricks
    "com.databricks" %% "spark-avro" % "4.0.0",

    "com.typesafe" % "config" % "1.2.0",

    "com.github.mrpowers" % "spark-fast-tests_2.11" % "0.11.0" % "test",

    // Testing
    "org.scalatest" %% "scalatest" % "2.2.6" % Test
  )

}