package study.w04.practice.base

fun main() {
    val director = Director()
    val clientPaperName = "사이트 개편"
    director.addProject(clientPaperName, Client())
    director.runProject(clientPaperName)

    val serverClientPaperName = "은행 리뉴얼"
    director.addProject(serverClientPaperName, ServerClient())
    director.runProject(serverClientPaperName)
}