lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-web-api-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Mongo API Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.projectlombok" % "lombok" % "1.18.8",
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.1",
    "org.springframework.boot" % "spring-boot-starter-data-mongodb" % "2.4.1"
   ),

  mainClass := Some("example.Main")
)
