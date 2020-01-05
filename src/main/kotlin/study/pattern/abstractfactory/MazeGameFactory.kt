package study.pattern.abstractfactory

interface MazeGameFactory {
    fun createMaze(): Maze
    fun createRoom(number: Int): Room
    fun createDoor(room1: Room, room2: Room): Door
}
