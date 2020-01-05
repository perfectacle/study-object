package study.w04.practice.self.v2

class ServerClientFrontend : Frontend<ServerClient>() {
    override fun setData(paper: ServerClient) {
        language = paper.frontendLanguage
    }
}