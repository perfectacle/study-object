package study.w04.v6

import study.w04.Program

fun main() {
    val director = Director()
    val clientPaperName = "사이트 개편"
    director.addProject(clientPaperName, object: Client() {
        override fun run(): Array<Program> {
            val frontend = object : Frontend<Client>() {
                override fun setData(paper: Client) {
                    language = paper.language
                    library = paper.library
                }
            }

            programmer = frontend
            return arrayOf(programmer.getProgram(this))
        }
    })
    director.runProject(clientPaperName)

    val serverClientPaperName = "은행 리뉴얼"
    director.addProject(serverClientPaperName, object: ServerClient() {
        override fun run(): Array<Program> {
            val frontend = object : Frontend<ServerClient>() {
                override fun setData(paper: ServerClient) {
                    language = paper.frontendLanguage
                }
            }
            val backend = Backend()

            frontendProgrammer = frontend
            backendProgrammer = backend

            return arrayOf(frontendProgrammer.getProgram(this), backendProgrammer.getProgram(this))
        }

    })
    director.runProject(serverClientPaperName)
}