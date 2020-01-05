package study.w04.practice.base

import study.w04.Language
import study.w04.Library

class Client : Paper {
    val library = Library("vueJS")
    val language = Language("kotlinJS")
    lateinit var programmer: Programmer
}