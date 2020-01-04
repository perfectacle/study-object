package study.w04.v5

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
            val backend = Backend()
            paper.frontendProgrammer = frontend
            paper.backendProgrammer = backend
            val client = frontend.getProgram(paper)
            val server = backend.getProgram(paper)
            deploy(name, client, server)
        } else if (paper is Client) {
            val frontend = object: Frontend<Client>() {
                override fun setData(paper: Client) {
                    language = paper.language
                    library = paper.library
                }
            }
            paper.programmer = frontend
            val client = frontend.getProgram(paper)
            deploy(name, client)
        }
    }

    private fun deploy(name: String, vararg programs: Program) {}
}