package org.lafeuille.adventofcode.y2021
package d03

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

val sample = List("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000", "11001", "00010", "01010")

class Day03Spec extends AnyFlatSpec {

}

class Part1Spec extends AnyFlatSpec with should.Matchers {
  val matrix: Array[Array[Char]] = Part1.matrix(sample)

  "Sample input" should "have gamma 22" in {
    Part1.gamma(matrix) shouldBe 22
  }

  it should "have epsilon 9" in {
    Part1.epsilon(matrix) shouldBe 9
  }

  it should "have result 198" in {
    Part1.result(sample)
  }

  val expected = 4139586

  "MyInput" should s"have result of $expected" in {
    Part1.result(Day03.myBinaries) shouldBe expected
  }
}

class Part2Spec extends AnyFlatSpec with should.Matchers {
  val expected = 0

  "MyInput" should s"have result of $expected" in {
    Part2.result(Day03.myBinaries) shouldBe expected
  }
}
