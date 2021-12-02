package org.lafeuille.adventofcode.y2021
package d02

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

val sample: List[Command] =
  Command(Direction.forward, 5) ::
    Command(Direction.down, 5) ::
    Command(Direction.forward, 8) ::
    Command(Direction.up, 3) ::
    Command(Direction.down, 8) ::
    Command(Direction.forward, 2) ::
    Nil

class Part1Spec extends AnyFlatSpec with should.Matchers {
  "Sample input" should "have result of 150" in {
    Part1.result(sample) shouldBe 150
  }

  val expected = 1989265
  "My input" should s"have result of $expected" in {
    Part1.result(Day02.myCommands) shouldBe expected
  }
}

class Part2Spec extends AnyFlatSpec with should.Matchers {
  "Sample input" should "have result of 900" in {
    Part2.result(sample) shouldBe 900
  }

  val expected = 2089174012
  "My input" should s"have result of $expected" in {
    Part2.result(Day02.myCommands) shouldBe expected
  }
}
