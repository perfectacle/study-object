package study.w04.v2

import study.w04.Language
import study.w04.Library
import study.w04.Program

class Frontend : Programmer {
    lateinit var language: Language
    lateinit var library: Library

    override fun makeProgram(paper: Paper): Program {
        paper.setData(this)
        return makeFrontendProgram()
    }

    private fun makeFrontendProgram() = Program()
}