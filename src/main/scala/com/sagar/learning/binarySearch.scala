package com.sagar.learning

object binarySearch {
  def binarySearch(item: Int, numList: List[Int]) = {
    def search(begin: Int,
               end: Int): Option[Int] =
      (begin + end) / 2 match {
        case _ if begin > end             => None
        case mid if (numList(mid) < item) => search(mid + 1, end)
        case mid if (numList(mid) > item) => search(begin, mid - 1)
        case mid                          => Some(mid)
      }
    search(0, numList.size - 1)
  }
  def main(args: Array[String]) {
    val l = List(1, 2, 4, 5, 6, 8, 9, 25, 31);
    println(binarySearch(5, l))
    println(binarySearch(6, l))
  }
}
