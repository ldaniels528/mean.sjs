package io.scalajs.npm.kafkanode

import io.scalajs.FlexibleOptions

import scala.scalajs.js

/**
  * Producer Options
  * @param requireAcks     Configuration for when to consider a message as acknowledged, default 1
  * @param ackTimeoutMs    The amount of time in milliseconds to wait for all acks before considered, default 100ms
  * @param partitionerType Partitioner type (default = 0, random = 1, cyclic = 2, keyed = 3), default 0
  * @author lawrence.daniels@gmail.com
  */
class ProducerOptions(var requireAcks: js.UndefOr[Int] = js.undefined,
                      var ackTimeoutMs: js.UndefOr[Int] = js.undefined,
                      var partitionerType: js.UndefOr[Int] = js.undefined)
  extends js.Object

/**
  * Producer Options Companion
  * @author lawrence.daniels@gmail.com
  */
object ProducerOptions extends FlexibleOptions[ProducerOptions]
