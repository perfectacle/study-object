package study.w04

class Frontend : Programmer {
    private lateinit var language: Language
    private lateinit var library: Library

    override fun makeProgram(paper: Paper): Program {
        if (paper is Client) {
            language = paper.language
            library = paper.library
        }

        return makeFrontendProgram()
    }

    private fun makeFrontendProgram() = Program()
}