package study.w04.v6

import study.w04.Language
import study.w04.Program
import study.w04.Server

class Backend : Programmer<ServerClient>() {
    private lateinit var server: Server
    private lateinit var language: Language

    override fun makeProgram() = Program()
    override fun setData(paper: ServerClient) {
        server = paper.server
        language = paper.backendLanguage
    }
}