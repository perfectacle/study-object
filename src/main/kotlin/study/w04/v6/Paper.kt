package study.w04.v6

import study.w04.Program

interface Paper {
    // Director가 추상형이 아니기 때문에 메서드 위임만 해주면 됨!
    fun run(): Array<Program>
}