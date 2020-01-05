package study.pattern.factorymethod

import study.pattern.Direction
import study.pattern.Site

open class Room(
    private val number: Int
) : Site {
    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getSite(direction: Direction): Site {
        return this
    }

    fun addSite(direction: Direction, site: Site) {

    }
}