package org.lafeuille.adventofcode.y2021
package d02

import d01.Day01.getClass

import scala.annotation.tailrec
import scala.io.Source
import scala.util.matching.Regex

object Day02 {
  private val regex: Regex = "(forward|down|up)\\s+(\\d+)".r

  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myCommands: List[Command] =
    myInput.getLines
      .map { case regex(direction, units) =>
        Command(Direction.valueOf(direction), units.toInt)
      }
      .toList
}

case class Position(horizontal: Int = 0, depth: Int = 0)

enum Direction {
  case forward extends Direction
  case down extends Direction
  case up extends Direction
}

case class Command(direction: Direction, units: Int)

object Command {
  @tailrec
  def run(commands: List[Command], position: Position = Position()): Position =
    if commands.isEmpty then position else
      val newPosition = commands.head match {
        case Command(Direction.up, u) =>
          position.copy(depth = position.depth - u)
        case Command(Direction.down, u) =>
          position.copy(depth = position.depth + u)
        case Command(Direction.forward, u) =>
          position.copy(horizontal = position.horizontal + u)
      }
      run(commands.tail, newPosition)
}

object Part1 {
  def result(commands: List[Command]): Int =
    val position = Command.run(commands)
    position.depth * position.horizontal

  @main def runPart1(): Unit =
    println(result(Day02.myCommands))
}

object Part2 {
  def result(lines: List[Command]) = 0

  @main def runPart2(): Unit =
    println(result(Day02.myCommands))
}
