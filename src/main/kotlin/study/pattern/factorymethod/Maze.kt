package study.pattern.factorymethod

class Maze {
    fun addRoom(room: Room) {

    }

    fun findRoom(number: Int): Room {
        return Room(number)
    }
}