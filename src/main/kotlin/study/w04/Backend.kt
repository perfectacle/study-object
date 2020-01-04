package study.w04

class Backend : Programmer {
    private lateinit var server: Server
    private lateinit var language: Language

    override fun makeProgram(paper: Paper): Program {
        if (paper is ServerClient) {
            server = paper.server
            language = paper.backendLanguage
        }

        return makeBackendProgram()
    }

    private fun makeBackendProgram() = Program()
}