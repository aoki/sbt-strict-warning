# sbt-strict-warning

## Usage

Add plugin to your `plugins.sbt`.

```scala
addSbtPlugin("com.ringohub" % "sbt-strict-warning" % "0.1.0")
```

Add `scalaCompileOptions` to your project at `build.sbt` like a below.

```scala
import com.ringohub.sbt.StrictWarningPlugin.scalaCompileOptions

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.ringohub",
      version      := "0.1.0-SNAPSHOT",
      scalacOptions := scalaCompileOptions
    )),
    name := "Hello"
  )
```

### Testing

Run `test` for regular unit tests.

Run `scripted` for [sbt script tests](http://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html).

### Publishing

1. publish your source to GitHub
2. [create a bintray account](https://bintray.com/signup/index) and [set up bintray credentials](https://github.com/sbt/sbt-bintray#publishing)
3. create a bintray repository `sbt-plugins` 
4. update your bintray publishing settings in `build.sbt`
5. `sbt publish`
6. [request inclusion in sbt-plugin-releases](https://bintray.com/sbt/sbt-plugin-releases)
7. [Add your plugin to the community plugins list](https://github.com/sbt/website#attention-plugin-authors)
8. [Claim your project an Scaladex](https://github.com/scalacenter/scaladex-contrib#claim-your-project)
