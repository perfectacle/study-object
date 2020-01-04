package study.w04.v3

import study.w04.Language
import study.w04.Server

class ServerClient : Paper {
    private val server = Server("linux")
    private val backendLanguage = Language("kotlin")
    private val frontendLanguage = Language("kotlinJS")
    lateinit var backendProgrammer: Programmer
    lateinit var frontendProgrammer: Programmer
    override fun setData(programmer: Programmer) {
        if (programmer is Frontend) {
            programmer.language = frontendLanguage
        } else if (programmer is Backend) {
            programmer.server = server
            programmer.language = backendLanguage
        }
    }
}