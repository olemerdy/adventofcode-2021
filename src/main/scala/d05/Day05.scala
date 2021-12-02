package org.lafeuille.adventofcode.y2021
package d05

import scala.io.Source

object Day05 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myLines: List[String] =
    myInput.getLines.toList
}

object Part1 {
  def result(lines: List[String]): Int = 0

  @main def runPart1(): Unit =
    println(result(Day05.myLines))
}

object Part2 {
  def result(lines: List[String]): Int = 0

  @main def runPart2(): Unit =
    println(result(Day05.myLines))
}
