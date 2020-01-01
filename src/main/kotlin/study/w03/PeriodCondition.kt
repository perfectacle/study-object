package study.w03

import java.time.LocalDateTime

class PeriodCondition(
    private val whenScreened: LocalDateTime
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening, count: Int): Boolean {
        return whenScreened == screening.whenScreened
    }
}