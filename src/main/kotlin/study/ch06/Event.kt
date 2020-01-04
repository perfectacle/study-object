package study.ch06

import java.time.Duration
import java.time.LocalDateTime

class Event(
    private val subject: String,
    private var from: LocalDateTime,
    private var duration: Duration
) {
    fun isSatisfiedBy(schedule: RecurringSchedule) =
        schedule.dayOfWeek == from.dayOfWeek &&
                schedule.from == from.toLocalTime() &&
                schedule.duration == duration

    fun reschedule(schedule: RecurringSchedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(schedule)), schedule.from)
        duration = schedule.duration
    }

    private fun daysDistance(schedule: RecurringSchedule) =
        (schedule.dayOfWeek.value - from.dayOfWeek.value).toLong()
}