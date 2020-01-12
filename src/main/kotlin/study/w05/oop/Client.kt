package study.w05.oop

import study.w04.Language
import study.w04.Library

class Client : Paper {
    val library = Library("vueJS")
    val language = Language("kotlinJS")
    lateinit var programmer: Programmer
}