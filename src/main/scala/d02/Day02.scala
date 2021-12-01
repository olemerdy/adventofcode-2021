package org.lafeuille.adventofcode.y2021
package d02

import d01.Day01.getClass

import scala.io.Source

object Day02 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myLines: List[String] =
    myInput.getLines.toList
}

object Part1 {
  def result(lines: List[String]) = 0

  @main def runPart1(): Unit =
    println(result(Day02.myLines))
}

object Part2 {
  def result(lines: List[String]) = 0

  @main def runPart2(): Unit =
    println(result(Day02.myLines))
}
