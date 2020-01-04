package study.w04.v3

import study.w04.Language
import study.w04.Library
import study.w04.Program

class Frontend : Programmer() {
    lateinit var language: Language
    lateinit var library: Library

    private fun makeFrontendProgram() = Program()
    override fun makeProgram(paper: Paper) = makeFrontendProgram()
}