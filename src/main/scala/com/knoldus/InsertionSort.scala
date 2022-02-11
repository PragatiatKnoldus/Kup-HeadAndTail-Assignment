package com.knoldus

class InsertionSort {

  def insertionSort(list: List[Int]): List[Int] =
    if (list.isEmpty) throw new NullPointerException("List is empty")
    else innerInsertion(list)

  private def innerInsertion(list: List[Int]): List[Int] =
    if (list.isEmpty) Nil
    else insert(list.head, innerInsertion(list.tail))

  private def insert(listHead: Int, listTail: List[Int]): List[Int] =
    if (listTail.isEmpty || listHead <= listTail.head) listHead :: listTail
    else listTail.head :: insert(listHead, listTail.tail)
}