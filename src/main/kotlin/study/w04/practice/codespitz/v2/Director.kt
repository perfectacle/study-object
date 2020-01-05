package study.w04.practice.codespitz.v2

import study.w04.Program

class Director {
    private val projects = mutableMapOf<String, Paper>()

    fun addProject(name: String, paper: Paper) {
        projects[name] = paper
    }

    fun runProject(name: String) {
        val paper = projects[name] ?: throw RuntimeException("no project")
        if (paper is ServerClient) {
            val frontend = object: Frontend<ServerClient>() {
                override fun setData(paper: ServerClient) {
                    language = paper.frontendLanguage
                }
            }
            val backend = object: Backend() {
                override fun setData(paper: ServerClient) {
                    language = paper.backendLanguage
                    server = paper.server
                }
            }
            paper.frontendProgrammer = frontend
            paper.backendProgrammer = backend
            val client = frontend.makeProgram(paper)
            val server = backend.makeProgram(paper)
            deploy(name, client, server)
        } else if (paper is Client) {
            val frontend = object: Frontend<Client>() {
                override fun setData(paper: Client) {
                    language = paper.language
                }
            }
            paper.programmer = frontend
            val client = frontend.makeProgram(paper)
            deploy(name, client)
        }
    }

    private fun deploy(name: String, vararg programs: Program) {}
}