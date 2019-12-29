package study.ch04

import java.time.DayOfWeek
import java.time.LocalTime

class DiscountCondition(
    val type: DiscountConditionType,
    private val sequence: Int,
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
) {
    fun isDiscountable(dayOfWeek: DayOfWeek, time: LocalTime) =
        if (type != DiscountConditionType.PERIOD) {
            throw IllegalArgumentException()
        } else {
            this.dayOfWeek == dayOfWeek &&
                    this.startTime >= time &&
                    this.endTime <= time
        }

    fun isDiscountable(sequence: Int) =
        if (type != DiscountConditionType.SEQUENCE) {
            throw IllegalArgumentException()
        } else {
            this.sequence == sequence
        }
}