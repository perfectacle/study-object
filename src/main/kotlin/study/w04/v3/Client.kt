package study.w04.v3

import study.w04.Language
import study.w04.Library

class Client : Paper {
    private val library = Library("vueJS")
    private val language = Language("kotlinJS")
    lateinit var programmer: Programmer
    override fun setData(programmer: Programmer) {
        if (programmer is Frontend) {
            programmer.language = language
            programmer.library = library
        }
    }
}