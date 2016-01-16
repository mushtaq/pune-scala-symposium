name := "pune-scala-symposium"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ws" % "2.3.8",
  "org.scala-lang.modules" %% "scala-async" % "0.9.2",
  "io.reactivex" %% "rxscala" % "0.25.0",
  "org.specs2" %% "specs2" % "2.4.6" % "test"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
