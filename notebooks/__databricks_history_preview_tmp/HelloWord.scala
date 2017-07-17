// Databricks notebook source
val hi = "Hello "
val defaultName = "World"
def personalizedHi( name: Option[String]): Unit = {
  name match {
    case Some(n) => println(hi + n)
    case None => println(hi + defaultName)
  }
}

// COMMAND ----------

personalizedHi(None)
personalizedHi(Some("John"))

// COMMAND ----------

