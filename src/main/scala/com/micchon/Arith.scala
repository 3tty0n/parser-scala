package com.micchon

import scala.util.parsing.combinator._

class Arith extends JavaTokenParsers {
  // expr ::= term { "+" term | "-" term}
  def expr: Parser[Any] = term~rep("+"~term | "-"~term)
  // term ::= factor {"*" factor | "/" factor
  def term: Parser[Any] = factor~rep("*"~factor | "/"~factor)
  // factor ::= floatingPointNumber | "(" expr ")"
  def factor: Parser[Any] = floatingPointNumber | "("~expr~")"
}
