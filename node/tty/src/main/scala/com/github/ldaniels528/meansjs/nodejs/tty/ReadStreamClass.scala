package com.github.ldaniels528.meansjs.nodejs.tty

import com.github.ldaniels528.meansjs.nodejs.net.FileDescriptor

import scala.scalajs.js

/**
  * Read Stream class
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait ReadStreamClass extends js.Object {

  def apply(fd: FileDescriptor): ReadStream = js.native

  def apply(fd: FileDescriptor, options: js.Any): ReadStream = js.native

}

