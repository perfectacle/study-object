package study.w04

class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    val frontendLanguage = Language("kotlinJS")
    lateinit var backendProgrammer: Programmer
    lateinit var frontendProgrammer: Programmer
}