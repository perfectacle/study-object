package study.w04.practice.codespitz.v3

import study.w04.Language
import study.w04.Program
import study.w04.Server

abstract class Backend : Programmer<ServerClient> {
    protected lateinit var server: Server
    protected lateinit var language: Language

    override fun makeProgram(paper: ServerClient): Program {
        setData(paper)
        return makeBackendProgram()
    }

    private fun makeBackendProgram() = Program()
}