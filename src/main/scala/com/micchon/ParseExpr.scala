package com.micchon

object ParseExpr extends Arith {

  def main(args: Array[String]): Unit = {
    val value = "2 * (3 + 7)"
    println(parseAll(expr, value))
  }

}
