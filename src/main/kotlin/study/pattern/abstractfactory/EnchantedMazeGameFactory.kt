package study.pattern.abstractfactory

class EnchantedMazeGameFactory: MazeGameFactory {
    override fun createMaze(): Maze {
        return Maze()
    }

    override fun createRoom(number: Int): Room {
        return EnchantedRoom(number)
    }

    override fun createDoor(room1: Room, room2: Room): Door {
        return EnchantedDoor(room1, room2)
    }

}
