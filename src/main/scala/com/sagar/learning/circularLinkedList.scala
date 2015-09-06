package com.sagar.learning

import scala.collection.mutable.Queue

class circularLinkedList[Int](list: Seq[Int]) extends Iterator[Int] {
  val qu = new Queue[Int]
  qu ++= list
  var pos = 0
  def next = {
    if (pos == qu.length)
      pos == 0
    val value = qu(pos)
    pos = pos + 1
    value
  }

  def hasNext = !qu.isEmpty

  def add(a: Int) = qu += a

  //Function to insert an element in sorted circular linked list
  def insert(a: Int) = {

  }
  //def binarySearch(item: Int, numList: List[Int]) = {
  def search(first: Int,
             last: Int): Queue[Int] = {
    /*(begin + end) / 2 match {
      case _ if (begin > end) => Queue()
      case mid if (qu(mid) < item && qu(mid + 1) > item) => {
        val (left, right) = qu splitAt mid
        left ++ List(item) ++ right
      }
      case mid if (qu(mid) < item) => search(mid + 1, end)
      case mid if (qu(mid) > item) => search(begin, mid - 1)
      
    }
    * 
    */
     
    //search(0, numList.size - 1)
    Queue()
  }
}