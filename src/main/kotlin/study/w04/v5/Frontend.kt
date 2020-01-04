package study.w04.v5

import study.w04.Language
import study.w04.Library
import study.w04.Program

abstract class Frontend<in T: Paper> : Programmer<T>() {
    lateinit var language: Language
    lateinit var library: Library

    override fun makeProgram() = Program()
}