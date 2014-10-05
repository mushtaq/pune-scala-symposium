name := "pune-scala-symposium"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ws" % "2.3.4",
  "org.scala-lang.modules" %% "scala-async" % "0.9.2",
  "io.reactivex" %% "rxscala" % "0.21.1",
  "org.specs2" %% "specs2" % "2.4.6" % "test"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
