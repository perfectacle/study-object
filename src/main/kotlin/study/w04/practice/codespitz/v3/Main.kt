package study.w04.practice.codespitz.v3

import study.w04.Program

fun main() {
    val director = Director()
    val clientPaperName = "사이트 개편"
    director.addProject(clientPaperName, object: Client() {
        override fun run(): Array<Program> {
            val frontend = object: Frontend<Client>() {
                override fun setData(paper: Client) {
                    language = paper.language
                }
            }
            programmer = frontend
            val client = programmer.makeProgram(this)

            return arrayOf(client)
        }
    })
    director.runProject(clientPaperName)

    val serverClientPaperName = "은행 리뉴얼"
    director.addProject(serverClientPaperName, object: ServerClient() {
        override fun run(): Array<Program> {
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
            frontendProgrammer = frontend
            backendProgrammer = backend
            val client = frontend.makeProgram(this)
            val server = backend.makeProgram(this)

            return arrayOf(client, server)
        }
    })
    director.runProject(serverClientPaperName)
}