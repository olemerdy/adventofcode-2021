package org.lafeuille.adventofcode.y2021
package d03

import scala.io.Source

object Day03 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myBinaries: List[String] =
    myInput.getLines.toList
}

object Part1 {
  def matrix(binaries:List[String]): Array[Array[Char]] =
    Array.tabulate(binaries.head.length, binaries.length)((x, y) => binaries(y)(x))

  def gammaString(matrix: Array[Array[Char]]): String =
    matrix.map(chars => chars.groupBy(c => c).view.mapValues(_.length).maxBy(_._2)._1).mkString

  def epsilonString(matrix: Array[Array[Char]]):String =
    matrix.map(chars => chars.groupBy(c => c).view.mapValues(_.length).minBy(_._2)._1).mkString

  def gamma(matrix: Array[Array[Char]]): Int =
    Integer.parseInt(gammaString(matrix), 2)

  def epsilon(matrix: Array[Array[Char]]): Int =
    Integer.parseInt(epsilonString(matrix), 2)

  def result(binaries: List[String]): Int =
    val mat = matrix(binaries)
    gamma(mat) * epsilon(mat)

  @main def runPart1(): Unit =
    println(result(Day03.myBinaries))
}

object Part2 {
  def result(binaries: List[String]): Int = 0

  @main def runPart2(): Unit =
    println(result(Day03.myBinaries))
}
