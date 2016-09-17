package org.scalajs.sjs

import scala.concurrent.duration.Duration
import scala.scalajs.js

/**
  * js.Date Helper
  * @author Lawrence Daniels <lawrence.daniels@gmail.com>
  */
object DateHelper {

  /**
    * js.Date Enrichment
    * @param date0 the given [[js.Date date]]
    */
  implicit class JsDateEnrichment(val date0: js.Date) extends AnyVal {

    @inline
    def +(duration: Duration) = new js.Date(date0.getTime() + duration.toMillis)

    @inline
    def -(duration: Duration) = new js.Date(date0.getTime() - duration.toMillis)

    @inline
    def -(date1: js.Date) = date0.getTime() - date1.getTime()

    @inline
    def >(date1: js.Date) = date0.getTime() > date1.getTime()

    @inline
    def >=(date1: js.Date) = date0.getTime() >= date1.getTime()

    @inline
    def <(date1: js.Date) = date0.getTime() < date1.getTime()

    @inline
    def <=(date1: js.Date) = date0.getTime() <= date1.getTime()

  }

}