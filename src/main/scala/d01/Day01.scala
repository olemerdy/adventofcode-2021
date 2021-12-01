package org.lafeuille.adventofcode.y2021
package d01

import scala.io.Source

object Day01 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myNumbers: List[Int] =
    myInput.getLines.map(_.toInt).toList

  def pairs[T](list: List[T]): List[(T, T)] =
    if list.isEmpty then Nil else
      list zip list.tail

  def triplets[T](list: List[T]): List[(T, T, T)] =
    if list.size < 3 then Nil else
      list zip list.tail zip list.tail.tail map { case ((a, b), c) => (a, b, c) }
}

object Part1 {
  def result(numbers: List[Int]): Int =
    Day01.pairs(numbers).count { case (a, b) => a < b }

  @main def runPart1(): Unit =
    println(result(Day01.myNumbers))
}

object Part2 {
  def tripletsSum(numbers: List[Int]): List[Int] =
    Day01.triplets(numbers).map { case (a, b, c) => a + b + c }

  def result(numbers: List[Int]): Int =
    Part1.result(tripletsSum(numbers))

  @main def runPart2(): Unit =
    println(result(Day01.myNumbers))
}
