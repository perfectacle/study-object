package study.w05.adt

import study.w04.Language
import study.w04.Library
import study.w04.Program
import study.w04.Server

class Programmer(
    private val isFrontEnd: Boolean
) {
    // 이론충돌이 일어남, FrontEnd에도 Language가 있고, BackEnd에도 Language가 있기 때문에 두 개를 분리시켜줌.
    // 이름이 길어질 수 밖에 없고 점점 더 구체적이 될 수 밖에 없음.
    // 그리고 새로운 상태가 나올 때마다 앞에 지어줬던 이름을 계속 수정해야할 수도 있음.
    private lateinit var frontEndLanguage: Language
    private var backEndLanguage: Language? = null
    // library는 서버에서도 사용 가능하기 때문에 현재는 FrontEnd에서만 사용한다고 해서 Library라고 이름 지어주면 추상화 레벨이 맞지 않게됨.
    private var frontEndLibrary: Library? = null
    private var server: Server? = null
    fun makeProgram(paper: Paper): Program {
        return if (isFrontEnd) {
            frontEndLanguage = paper.language
            frontEndLibrary = paper.library
            makeFrontendProgram()
        } else {
            backEndLanguage = paper.backendLanguage
            server = paper.server
            makeBackendProgram()
        }
    }
    private fun makeFrontendProgram() = Program()
    private fun makeBackendProgram() = Program()
}