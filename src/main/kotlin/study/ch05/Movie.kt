package study.ch05

import java.time.Duration

abstract class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    val discountConditions: List<DiscountCondition>
) {
    fun calculateMovieFee(screening: Screening): Money {
        return if (isDiscountable(screening)) {
            fee - calculateDiscountAmount()
        } else {
            fee
        }
    }

    private fun isDiscountable(screening: Screening): Boolean {
        return discountConditions.any { condition ->
            condition.isSatisfiedBy(screening)
        }
    }

    abstract fun calculateDiscountAmount(): Money
}
