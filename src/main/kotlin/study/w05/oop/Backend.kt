package study.w05.oop

import study.w04.Language
import study.w04.Program
import study.w04.Server

class Backend : Programmer {
    private lateinit var server: Server
    private lateinit var language: Language

    override fun makeProgram(paper: Paper): Program {
        if (paper is ServerClient) {
            server = paper.server
            language = paper.backendLanguage
        }

        return makeBackendProgram()
    }

    private fun makeBackendProgram() = Program()
}