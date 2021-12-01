package org.lafeuille.adventofcode.y2021
package d01

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

class Day01Spec extends AnyFlatSpec with should.Matchers {
  val sample = List(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
  val triplets = List((199, 200, 208), (200, 208, 210), (208, 210, 200), (210, 200, 207), (200, 207, 240), (207, 240, 269), (240, 269, 260), (269, 260, 263))

  "Sample list from part2" should "have triplets" in {
    Day01.triplets(sample) shouldBe triplets
  }
}

class Part1Spec extends AnyFlatSpec with should.Matchers {

  val expected = 1692

  "My input" should s"have a result of $expected" in {
    Part1.result(Day01.myNumbers) shouldBe 1692
  }

}

class Part2Spec extends AnyFlatSpec with should.Matchers {

  val sample = List(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
  val tripletsSum = List(607, 618, 618, 617, 647, 716, 769, 792)

  "Sample list" should s"have tripletSum of $tripletsSum" in {
    Part2.tripletsSum(sample) shouldBe tripletsSum
  }

  val expected = 1724

  "My input" should  s"have a part 2 result of $expected" in {
    Part2.result(Day01.myNumbers) shouldBe expected
  }
}
