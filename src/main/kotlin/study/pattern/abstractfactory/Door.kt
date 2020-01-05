package study.pattern.abstractfactory

import study.pattern.Site

open class Door(
    private val room1: Room,
    private val room2: Room
) : Site {
    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun otherRoomFrom(room: Room): Room {
        return room
    }

    fun isOpen(): Boolean {
        return false
    }
}