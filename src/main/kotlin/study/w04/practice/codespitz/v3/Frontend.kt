package study.w04.practice.codespitz.v3

import study.w04.Language
import study.w04.Library
import study.w04.Program

abstract class Frontend<in T: Paper> : Programmer<T> {
    protected lateinit var language: Language
    protected lateinit var library: Library

    override fun makeProgram(paper: T): Program {
        setData(paper)
        return makeFrontendProgram()
    }

    private fun makeFrontendProgram() = Program()
}