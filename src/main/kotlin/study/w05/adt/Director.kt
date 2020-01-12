package study.w05.adt

import study.w04.Program

class Director {
    private val projects = mutableMapOf<String, Paper>()

    fun addProject(name: String, paper: Paper) {
        projects[name] = paper
    }

    fun runProject(name: String) {
        if (!projects.containsKey(name)) throw RuntimeException("no project")
        val paper = projects[name]
        if (paper?.isClient == false) {
            val frontend = Programmer(true)
            val backend = Programmer(false)
            paper.frontendProgrammer = frontend
            paper.backendProgrammer = backend
            val client = frontend.makeProgram(paper)
            val server = backend.makeProgram(paper)
            deploy(name, client, server)
        } else if (paper?.isClient == true) {
            val frontend = Programmer(true)
            paper.programmer = frontend
            val client = frontend.makeProgram(paper)
            deploy(name, client)
        }
    }

    private fun deploy(name: String, vararg programs: Program) {}
}