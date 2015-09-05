package com.sagar.learning

object quickSort extends App{
  def quickSort(xs: List[Int]): List[Int] = {
    if (xs.length < 2)
      xs
    else {
      val pivot = xs(0)
      quickSort(xs filter (pivot>)) ++ quickSort(xs filter (pivot==)) ++ quickSort(xs filter (pivot<))
    }
  }
  println("With quick sort "+ quickSort(List(65, 4, 67, 3, 45, 32)))
}