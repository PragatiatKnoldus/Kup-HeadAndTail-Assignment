package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class InsertionSortTest extends AnyFlatSpec {

  val insertion = new InsertionSort

  "A condition" should "return sorted list" in {
    assert(List(1, 2, 3, 6, 7, 8, 9) == insertion.insertionSort(List(8, 3, 7, 6, 2, 9, 1)))
  }

  "A condition" should "throw an exception for an empty list" in {
    val errorMessage = "List is empty"
    val error = intercept[NullPointerException] {
      insertion.insertionSort(List())
    }
    assert(errorMessage == error.getMessage)
  }
}