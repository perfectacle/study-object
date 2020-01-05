package study.pattern

class MazeGame {
    fun create(): Maze {
        val maze = Maze()
        val room1 = Room(1)
        val room2 = Room(2)
        val door = Door(room1, room2)

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