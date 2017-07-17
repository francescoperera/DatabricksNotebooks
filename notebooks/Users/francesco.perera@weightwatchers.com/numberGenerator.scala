// Databricks notebook source
def numberGenerator(roof: Int): Int = {
  val random = scala.util.Random
  random.nextInt(roof)
} 

// COMMAND ----------

//this is an example
val someNum = numberGenerator(10)
println(someNum)

// COMMAND ----------

