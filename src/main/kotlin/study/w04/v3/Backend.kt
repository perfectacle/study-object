package study.w04.v3

import study.w04.Language
import study.w04.Program
import study.w04.Server

class Backend : Programmer() {
    lateinit var server: Server
    lateinit var language: Language

    override fun makeProgram(paper: Paper): Program = makeBackendProgram()
    private fun makeBackendProgram() = Program()
}