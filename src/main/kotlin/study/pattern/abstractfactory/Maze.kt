package study.pattern.abstractfactory

class Maze {
    fun addRoom(room: Room) {

    }

    fun findRoom(number: Int): Room {
        return Room(number)
    }
}