package study.w04.v6

import study.w04.Language
import study.w04.Server

abstract class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    val frontendLanguage = Language("kotlinJS")
    protected lateinit var backendProgrammer: Programmer<ServerClient>
    protected lateinit var frontendProgrammer: Programmer<ServerClient>
}