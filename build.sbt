name := """sbt-strict-warning"""
organization := "com.ringohub"
version := "0.1.0"
crossSbtVersions := Seq("0.13.5", "1.1.1")
sbtPlugin := true

bintrayPackageLabels := Seq("sbt", "plugin")
bintrayVcsUrl := Some("""git@github.com:com.ringohub/sbt-strict-warning.git""")

initialCommands in console := """import com.ringohub.sbt._"""

// set up 'scripted; sbt plugin for testing sbt plugins
scriptedLaunchOpts ++= Seq("-Xmx1024M", "-Dplugin.version=" + version.value)


licenses += ("MIT", url("https://opensource.org/licenses/mit-license.php"))

publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization in bintray := None
