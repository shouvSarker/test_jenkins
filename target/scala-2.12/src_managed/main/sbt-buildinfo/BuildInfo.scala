package au.com.agiledigital.toolform.version

import scala.Predef._

/** This object was generated by sbt-buildinfo. */
case object BuildInfo {
  /** The value is "toolform". */
  val name: String = "toolform"
  /** The value is "0.0.1-SNAPSHOT". */
  val version: String = "0.0.1-SNAPSHOT"
  /** The value is "2.12.4". */
  val scalaVersion: String = "2.12.4"
  /** The value is "1.0.2". */
  val sbtVersion: String = "1.0.2"
  override val toString: String = {
    "name: %s, version: %s, scalaVersion: %s, sbtVersion: %s" format (
      name, version, scalaVersion, sbtVersion
    )
  }
}
