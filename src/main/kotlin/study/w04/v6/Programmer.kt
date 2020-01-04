package study.w04.v6

import study.w04.Program

abstract class Programmer<in T: Paper> {
    fun getProgram(paper: T): Program {
        setData(paper)
        return makeProgram()
    }

    // 부모 자식 간에도 할리우드 원칙으로... 얘야, 니가 알아서 하렴, 난 궁금하지 않단다. (리턴도 없음)
    // 부모를 짤 때도 할리우드 원칙을 지키면 자식의 변경에 대한 여파가 오지 않는다.
    abstract fun setData(paper: T)
    abstract fun makeProgram(): Program
}