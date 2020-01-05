package study.w04.practice.base

import study.w04.Language
import study.w04.Library
import study.w04.Program

class Frontend : Programmer {
    private lateinit var language: Language
    private lateinit var library: Library

    override fun makeProgram(paper: Paper): Program {
        if (paper is Client) {
            language = paper.language
            library = paper.library
        } else if (paper is ServerClient) {
            language = paper.frontendLanguage
        }
        return makeFrontendProgram()
    }

    private fun makeFrontendProgram() = Program()
}