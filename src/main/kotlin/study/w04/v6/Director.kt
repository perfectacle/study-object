package study.w04.v6

import study.w04.Program

class Director {
    private val projects = mutableMapOf<String, Paper>()

    fun addProject(name: String, paper: Paper) {
        projects[name] = paper
    }

    fun runProject(name: String) {
        val paper = projects[name] ?: throw RuntimeException("no project")
        deploy(name, *paper.run())
    }

    private fun deploy(name: String, vararg programs: Program) {}
}