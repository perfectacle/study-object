package study.w02

import java.time.Duration

class Movie(
    val title: String,
    val runningTime: Duration,
    val fee: Money,
    val discountConditions: Set<DiscountCondition>
) {
    fun calculateFee(screening: Screening, audienceCount: Int): Money {
        discountConditions.forEach { condition ->
            if (condition.isSatisfiedBy(screening, audienceCount)) {
                return condition.calculateFee(fee) * audienceCount.toDouble()
            }
        }

        return fee
    }
}