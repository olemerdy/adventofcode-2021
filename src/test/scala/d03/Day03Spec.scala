package org.lafeuille.adventofcode.y2021
package d03

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

class Day03Spec extends AnyFlatSpec {

}

class Part1Spec extends AnyFlatSpec with should.Matchers {
  val expected = 0

  "MyInput" should s"have result of $expected" in {
    Part1.result(Day03.myLines) shouldBe expected
  }
}

class Part2Spec extends AnyFlatSpec with should.Matchers {
  val expected = 0

  "MyInput" should s"have result of $expected" in {
    Part2.result(Day03.myLines) shouldBe expected
  }
}
