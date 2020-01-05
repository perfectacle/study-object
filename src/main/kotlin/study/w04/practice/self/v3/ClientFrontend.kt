package study.w04.practice.self.v3

class ClientFrontend : Frontend<Client>() {
    override fun setData(paper: Client) {
        language = paper.language
        library = paper.library
    }
}