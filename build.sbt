name := "scalatron_bot"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += Resolver.typesafeIvyRepo("releases")
resolvers += DefaultMavenRepository

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.+",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.+",
  "org.apache.httpcomponents" % "httpclient" % "4.4.1",
  "org.apache.httpcomponents" % "httpcore" % "4.4.1",
  "org.scala-lang" % "scala-compiler" % "2.11.7",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
  "com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.5.4",
  "org.eclipse.jetty" % "jetty-server" % "9.3.2.v20150730",
  "org.eclipse.jetty" % "jetty-servlet" % "9.3.2.v20150730",
  "com.sun.jersey" % "jersey-bundle" % "1.19",
  "javax.servlet" % "javax.servlet-api" % "3.1.0",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.0.1",
  "org.eclipse.jgit" % "org.eclipse.jgit" % "4.0.1.201506240215-r",
  "org.eclipse.jgit" % "org.eclipse.jgit.http.server" % "4.0.1.201506240215-r"
)