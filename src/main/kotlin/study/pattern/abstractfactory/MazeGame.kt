package study.pattern.abstractfactory

import study.pattern.Direction
import study.pattern.Wall

class MazeGame(
    private val factory: MazeGameFactory
) {
    fun create(): Maze {
        val maze = factory.createMaze()
        val room1 = factory.createRoom(1)
        val room2 = factory.createRoom(2)
        val door = factory.createDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.addSite(Direction.N, Wall())
        room1.addSite(Direction.E, door)
        room1.addSite(Direction.W, Wall())
        room1.addSite(Direction.S, Wall())

        room2.addSite(Direction.N, Wall())
        room2.addSite(Direction.E, Wall())
        room2.addSite(Direction.W, door)
        room2.addSite(Direction.S, Wall())

        return maze
    }
}