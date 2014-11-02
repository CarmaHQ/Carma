name := """carma"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.2.0-2",
  "com.feth" %% "play-authenticate" % "0.6.6-SNAPSHOT"
)

resolvers ++= Seq(
	"Apache" at "http://repo1.maven.org/maven2/",
	"jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
	"play-easymail (release)" at "http://joscha.github.io/play-easymail/repo/releases/",
	"play-easymail (snapshot)" at "http://joscha.github.io/play-easymail/repo/snapshots/",
	"play-authenticate (release)" at "http://joscha.github.io/play-authenticate/repo/releases/",
	"play-authenticate (snapshot)" at "http://joscha.github.io/play-authenticate/repo/snapshots/"
)