package study.w04.practice.self.v3

import study.w04.Language
import study.w04.Program
import study.w04.Server

class ServerClient : Paper {
    val server = Server("linux")
    val backendLanguage = Language("kotlin")
    val frontendLanguage = Language("kotlinJS")
    private lateinit var backendProgrammer: Programmer<ServerClient>
    private lateinit var frontendProgrammer: Programmer<ServerClient>

    override fun run(): Array<Program> {
        frontendProgrammer = ServerClientFrontend()
        backendProgrammer = Backend()
        return arrayOf(frontendProgrammer.makeProgram(this), backendProgrammer.makeProgram(this))
    }
}