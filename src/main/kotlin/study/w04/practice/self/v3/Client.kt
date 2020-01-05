package study.w04.practice.self.v3

import study.w04.Language
import study.w04.Library
import study.w04.Program

class Client : Paper {
    val library = Library("vueJS")
    val language = Language("kotlinJS")
    private lateinit var programmer: Programmer<Client>

    override fun run(): Array<Program> {
        programmer = ClientFrontend()
        return arrayOf(programmer.makeProgram(this))
    }
}