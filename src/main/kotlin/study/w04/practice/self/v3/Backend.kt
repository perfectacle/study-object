package study.w04.practice.self.v3

import study.w04.Language
import study.w04.Program
import study.w04.Server

class Backend :
    Programmer<ServerClient> {
    private lateinit var server: Server
    private lateinit var language: Language

    override fun makeProgram(paper: ServerClient): Program {
        server = paper.server
        language = paper.backendLanguage

        return makeBackendProgram()
    }

    private fun makeBackendProgram() = Program()
}