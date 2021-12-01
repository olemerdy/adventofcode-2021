package org.lafeuille.adventofcode.y2021
package d01

import scala.io.Source

object Day01 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myNumbers: List[Int] =
    myInput.getLines.map(_.toInt).toList
}

object Part1 {
  def pairs(numbers: List[Int]): List[(Int, Int)] =
    numbers zip numbers.tail

  def result(numbers: List[Int]): Int =
    pairs(numbers).count { case (a, b) => a < b }

  @main def run(): Unit =
    println(result(Day01.myNumbers))
}
