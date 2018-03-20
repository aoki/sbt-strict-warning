package com.ringohub.sbt

import sbt._

object StrictWarningPlugin extends AutoPlugin {

  def scalaCompileOptions: Seq[String] = {
    val commonOptions = Seq(
      "-feature", "-unchecked", "-Xlint",
      "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-unused", "-Ywarn-unused-import", "-Ywarn-value-discard"
    )
    sys.props.get("ignore-deprecation") match {
      case Some("true") | Some("yes") => commonOptions ++ Seq("-deprecation:false", "-Xfatal-warnings")
      case _                          => commonOptions ++ Seq("-deprecation")
    }
  }

}
