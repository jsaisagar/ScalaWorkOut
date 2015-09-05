package com.sagar.learning

object mergeSortWithTail extends App{
  def less(x: Int, y: Int): Boolean = x < y

  def mergeSort[T](numList: List[T])(implicit equality: (T, T) => Boolean): List[T] = {

    def merge(left: List[T], right: List[T], accum : List[T]): List[T] = {
      (left, right) match {
        case (Nil, _) => accum ++ right
        case (_, Nil) => accum ++ left
        case (l :: ls, r :: rs) =>
          if (equality(l, r))
            merge(ls, right,accum :+ l)
          else
            merge(left, rs, accum :+ r)
      }
    }
    if (numList.size / 2 == 0)
      numList
    else {
      val (left, right) = numList splitAt numList.size / 2
      merge(mergeSort(left), mergeSort(right),Nil)
    }
  }
   println("With Tail Recursion "+ mergeSort(List(65, 4, 67, 3, 45, 32))(less))
}