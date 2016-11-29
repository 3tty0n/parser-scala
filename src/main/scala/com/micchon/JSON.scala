package com.micchon

import scala.util.parsing.combinator.JavaTokenParsers

class JSON extends JavaTokenParsers{
  def value: Parser[Any] = obj | arr |
                           stringLiteral |
                           floatingPointNumber |
                           "null" | "true" | "false"
  def obj: Parser[Any] = "{"~repsep(member, ",")~"}"
  def arr: Parser[Any] = "["~repsep(member, ",")~"}"
  def member: Parser[Any] = stringLiteral~":"~value
}
