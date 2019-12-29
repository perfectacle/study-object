package study.w02

import java.time.LocalDateTime

class Screening(
    private var seat: Int,
    val sequence: Int,
    val whenScreened: LocalDateTime
) {
    // 트리거
    fun hasSeat(count: Int) = seat >= count

    // 액션 (외부에서 레이지하게 쓰기 위해서...)
    fun reserveSeat(count: Int) = if (hasSeat(count)) {
        seat -= count
    } else {
        throw IllegalArgumentException("no seat")
    }
}
