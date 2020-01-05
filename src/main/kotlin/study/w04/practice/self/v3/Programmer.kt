package study.w04.practice.self.v3

import study.w04.Program

interface Programmer<in T: Paper> {
    fun makeProgram(paper: T): Program
}