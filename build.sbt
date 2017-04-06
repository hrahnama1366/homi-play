name := "firstplay"

version := "1.0"

lazy val `firstplay` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Online Maven Repository" at "http://central.maven.org/maven2/"

resolvers += "Local Maven Repository" at "file:///"+Path.userHome.absolutePath+"/.m2/repository"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  