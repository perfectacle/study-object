package study.w04.v3

import study.w04.Program

abstract class Programmer {
    fun getProgram(paper: Paper): Program {
        paper.setData(this)
        return makeProgram(paper)
    }

    abstract fun makeProgram(paper: Paper): Program
}