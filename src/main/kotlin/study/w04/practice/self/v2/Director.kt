package study.w04.practice.self.v2

import study.w04.Program

class Director {
    private val projects = mutableMapOf<String, Paper>()

    fun addProject(name: String, paper: Paper) {
        projects[name] = paper
    }

    fun runProject(name: String) {
        val paper = projects[name] ?: throw RuntimeException("no project")
        if (paper is ServerClient) {
            val frontend = ServerClientFrontend()
            val backend = Backend()
            paper.frontendProgrammer = frontend
            paper.backendProgrammer = backend
            val client = frontend.makeProgram(paper)
            val server = backend.makeProgram(paper)
            deploy(name, client, server)
        } else if (paper is Client) {
            val frontend = ClientFrontend()
            paper.programmer = frontend
            val client = frontend.makeProgram(paper)
            deploy(name, client)
        }
    }

    private fun deploy(name: String, vararg programs: Program) {}
}