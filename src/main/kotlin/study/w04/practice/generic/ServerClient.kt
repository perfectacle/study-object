package study.w04.practice.generic

import study.w04.Language
import study.w04.Server

class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    private val frontendLanguage = Language("kotlinJS")
    lateinit var backendProgrammer: Programmer
    lateinit var frontendProgrammer: Programmer
}