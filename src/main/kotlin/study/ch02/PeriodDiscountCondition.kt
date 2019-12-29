package study.ch02

import java.time.DayOfWeek
import java.time.LocalTime

class PeriodDiscountCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening) =
        screening.whenScreened.dayOfWeek == dayOfWeek &&
                startTime >= screening.whenScreened.toLocalTime() &&
                endTime <= screening.whenScreened.toLocalTime()
}