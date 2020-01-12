package study.w05.adt

import study.w04.Language
import study.w04.Library
import study.w04.Server

/**
 * 외부에서는 Client 전용인지, ServerClient 전용인지를 내부에 추상화 시켜놨음.
 * 외부에서는 알 방법이 없어서 캡슐화를 높인 것처럼 보임.
 * 하지만 내부에 이질적인 컨텍스트를 가지고 있기 때문에 이 캡슐화가 절대 좋은 게 아님
 * 체계적인 학습을 통해 얻어낼 수 있는 지식(Knowledge)가 아니라 소스코드를 까봐야 알 수 있는 노하우(Know-how)임.
 * */
class Paper(
    val isClient: Boolean
) {
    val library: Library? = Library("vueJS")
        get() {
            return if (isClient) field
            else null
        }
    val language = Language("kotlinJS")
    var programmer: Programmer? = null
        set(value) {
            if (isClient) field = value
        }

    val server: Server? = Server("linux")
        get() {
            return if (isClient) null
            else field
        }
    val backendLanguage: Language? = Language("kotlin")
        get() {
            return if (isClient) null
            else field
        }
    val frontendLanguage = Language("kotlinJS")
        get() {
            return if (isClient) language
            else field
        }
    var backendProgrammer: Programmer? = null
        set(value) {
            if (isClient) field = value
        }
    var frontendProgrammer: Programmer? = null
        set(value) {
            if (isClient) field = value
        }
}