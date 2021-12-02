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

case class Position(horizontal: Int = 0, depth: Int = 0) {
  def run(command: Command): Position = command match {
    case Command(Direction.up, u) =>
      copy(depth = depth - u)
    case Command(Direction.down, u) =>
      copy(depth = depth + u)
    case Command(Direction.forward, u) =>
      copy(horizontal = horizontal + u)
  }
}

case class PositionWithAim(horizontal: Int = 0, depth: Int = 0, aim: Int = 0) {
  def run(command: Command): PositionWithAim = command match {
    case Command(Direction.up, u) =>
      copy(aim = aim - u)
    case Command(Direction.down, u) =>
      copy(aim = aim + u)
    case Command(Direction.forward, u) =>
      copy(horizontal = horizontal + u, depth = depth + aim * u)
  }
}

enum Direction {
  case forward extends Direction
  case down extends Direction
  case up extends Direction
}

case class Command(direction: Direction, units: Int)

object Command {
  @tailrec def run(commands: List[Command], position: Position): Position =
    if commands.isEmpty then position else
      run(commands.tail, position.run(commands.head))

  @tailrec def run(commands: List[Command], position: PositionWithAim): PositionWithAim =
    if commands.isEmpty then position else
      run(commands.tail, position.run(commands.head))
}

object Part1 {
  def result(commands: List[Command]): Int =
    val position = Command.run(commands, Position())
    position.depth * position.horizontal

  @main def runPart1(): Unit =
    println(result(Day02.myCommands))
}

object Part2 {
  def result(commands: List[Command]): Int =
    val position = Command.run(commands, PositionWithAim())
    position.depth * position.horizontal

  @main def runPart2(): Unit =
    println(result(Day02.myCommands))
}
