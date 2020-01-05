package study.w04.practice.self.v3

import study.w04.practice.self.v3.Frontend
import study.w04.practice.self.v3.ServerClient

class ServerClientFrontend : Frontend<ServerClient>() {
    override fun setData(paper: ServerClient) {
        language = paper.frontendLanguage
    }
}