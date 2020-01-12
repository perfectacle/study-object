package study.w05.oop

import study.w04.Language
import study.w04.Server

class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    val frontendLanguage = Language("kotlinJS")
    lateinit var backendProgrammer: Programmer
    lateinit var frontendProgrammer: Programmer
}