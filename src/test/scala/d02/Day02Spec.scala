package org.lafeuille.adventofcode.y2021
package d02

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

class Day02Spec extends AnyFlatSpec with should.Matchers {

}

class Part1Spec extends AnyFlatSpec with should.Matchers {
  val expected = 1989265
  "My input" should s"have result of $expected" in {
    Part1.result(Day02.myCommands) shouldBe expected
  }
}

class Part2Spec extends AnyFlatSpec with should.Matchers {
  val expected = 2089174012
  "My input" should s"have result of $expected" in {
    Part2.result(Day02.myCommands) shouldBe expected
  }
}
