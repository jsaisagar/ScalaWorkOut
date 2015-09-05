package com.sagar.learning

object insertionSort extends App{
  def insertionSort(array : Array[Int]) : Array[Int] = {
    for ( idx <- 0 to array.length-1){
      val key = array(idx)
      var j = idx - 1
      while(j>=0 && array(j) > key){
        array(j+1) = array(j)
        j = j - 1
      }
      array(j+1) = key
    }
    array
  }
  println("With insertion sort "+ insertionSort(Array(65, 4, 67, 3, 45, 32)).toList)
}