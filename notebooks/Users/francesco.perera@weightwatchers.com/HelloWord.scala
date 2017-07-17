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
println("Hello from Sublime")
println("Hi Again")
//adding a comment


// COMMAND ----------

def subtract(x: Int, y: Int): Int = x - y
println("new cell")
