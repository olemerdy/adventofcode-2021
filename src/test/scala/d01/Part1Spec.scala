package org.lafeuille.adventofcode.y2021
package d01

import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.*

class Part1Spec extends AnyFlatSpec with should.Matchers {

  val expected = 1692

  "My input" should s"have a result of $expected" in {
    Part1.result(Day01.myNumbers) shouldBe 1692
  }

}
