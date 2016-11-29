package com.micchon

import java.io.{File, FileReader}

import com.micchon.ParseJson.{parseAll, value}

object ParseJson extends JSON {

  val json =
      """
        |{ "name"   : "Alice Brown",
        |  "sku"    : "54321",
        |  "price"  : 199.95,
        |  "shipTo" : { "name" : "Bob Brown",
        |               "address" : "456 Oak Lane",
        |               "city" : "Pretendville",
        |               "state" : "HI",
        |               "zip"   : "98999" },
        |  "billTo" : { "name" : "Alice Brown",
        |               "address" : "456 Oak Lane",
        |               "city" : "Pretendville",
        |               "state" : "HI",
        |               "zip"   : "98999" }
        |}
      """.stripMargin

  def main(args: Array[String]): Unit = {
    println(parseAll(value, json))
  }

}

object ParseJson1 extends JSON1 {

  val json =
    """
      |{ "name"   : "Alice Brown",
      |  "sku"    : "54321",
      |  "price"  : 199.95,
      |  "shipTo" : { "name" : "Bob Brown",
      |               "address" : "456 Oak Lane",
      |               "city" : "Pretendville",
      |               "state" : "HI",
      |               "zip"   : "98999" },
      |  "billTo" : { "name" : "Alice Brown",
      |               "address" : "456 Oak Lane",
      |               "city" : "Pretendville",
      |               "state" : "HI",
      |               "zip"   : "98999" }
      |}
    """.stripMargin

  def main(args: Array[String]): Unit = {
    println(parseAll(value, json))
  }
}
