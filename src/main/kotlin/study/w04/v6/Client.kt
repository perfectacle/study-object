package study.w04.v6

import study.w04.Language
import study.w04.Library

abstract class Client : Paper {
    val library = Library("vueJS")
    val language = Language("kotlinJS")
    protected lateinit var programmer: Programmer<Client>
}