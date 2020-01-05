package study.w04.practice.codespitz.v2

import study.w04.Language
import study.w04.Server

class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    val frontendLanguage = Language("kotlinJS")
    lateinit var backendProgrammer: Programmer<ServerClient>
    lateinit var frontendProgrammer: Programmer<ServerClient>
}