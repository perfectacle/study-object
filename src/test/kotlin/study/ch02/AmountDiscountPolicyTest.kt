package study.ch02

import org.junit.jupiter.api.Test
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

class AmountDiscountPolicyTest {
    @Test
    fun test() {
        val avatar = Movie(
            title = "아바타",
            runningTime = Duration.ofMinutes(120L),
            fee = Money.wons(10000L),
            discountPolicy = AmountDiscountPolicy(
                discountAmount = Money.wons(800),
                conditions = listOf(
                    SequenceDiscountCondition(1),
                    SequenceDiscountCondition(10),
                    PeriodDiscountCondition(
                        dayOfWeek = DayOfWeek.MONDAY,
                        startTime = LocalTime.of(10, 0),
                        endTime = LocalTime.of(11, 59)
                    ),
                    PeriodDiscountCondition(
                        dayOfWeek = DayOfWeek.THURSDAY,
                        startTime = LocalTime.of(10, 0),
                        endTime = LocalTime.of(20, 59)
                    )
                )
            )
        )

        val titanic = Movie(
            title = "타이타닉",
            runningTime = Duration.ofMinutes(180L),
            fee = Money.wons(11000L),
            discountPolicy = PercentDiscountPolicy(
                percent = 0.1,
                conditions = listOf(
                    PeriodDiscountCondition(
                        dayOfWeek = DayOfWeek.TUESDAY,
                        startTime = LocalTime.of(14, 0),
                        endTime = LocalTime.of(16, 59)
                    ),
                    SequenceDiscountCondition(2),
                    PeriodDiscountCondition(
                        dayOfWeek = DayOfWeek.THURSDAY,
                        startTime = LocalTime.of(10, 0),
                        endTime = LocalTime.of(13, 59)
                    )
                )
            )
        )
    }
}