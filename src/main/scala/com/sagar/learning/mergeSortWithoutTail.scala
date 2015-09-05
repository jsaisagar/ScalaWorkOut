package com.sagar.learning

object mergeSortWithoutTail extends App {
  def less(x: Int, y: Int): Boolean = x < y

  def mergeSort[T](numList: List[T])(implicit equality: (T, T) => Boolean): List[T] = {

    /*
     * If we see the below function implementation, the recursive
     * function is waiting for the result of next call. Hence if we can pass the
     * value of the call, things will be smoother 
     */
    def merge(left: List[T], right: List[T]): List[T] = {
      (left, right) match {
        case (Nil, _) => right
        case (_, Nil) => left
        case (l :: ls, r :: rs) =>
          if (equality(l, r))
            l :: merge(ls, right)
          else
            r :: merge(left, rs)
      }
    }
    if (numList.size / 2 == 0)
      numList
    else {
      val (left, right) = numList splitAt numList.size / 2
      merge(mergeSort(left), mergeSort(right))
    }
  }

  println(mergeSort(List(65, 4, 67, 3, 45, 32))(less))
}