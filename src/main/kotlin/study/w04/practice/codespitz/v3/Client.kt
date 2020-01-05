package study.w04.practice.codespitz.v3

import study.w04.Language
import study.w04.Library

abstract class Client : Paper {
    val library = Library("vueJS")
    val language = Language("kotlinJS")
    lateinit var programmer: Programmer<Client>
}