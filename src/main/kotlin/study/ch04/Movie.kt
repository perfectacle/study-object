package study.ch04

import study.ch02.Money
import java.time.Duration
import java.time.LocalDateTime

class Movie(
    val movieType: MovieType,
    val fee: Money,
    private val title: String,
    private val runningTime: Duration,
    private val discountConditions: List<DiscountCondition>,
    private val discountAmount: Money,
    private val discountPercent: Double
) {
    fun calculateAmountDiscountFee() =
        if (movieType != MovieType.AMOUNT_DISCOUNT) {
            throw IllegalArgumentException()
        } else {
            fee.minus(discountAmount)
        }

    fun calculatePercentDiscountFee() =
        if (movieType != MovieType.PERCENT_DISCOUNT) {
            throw IllegalArgumentException()
        } else {
            fee.minus(fee.times(discountPercent))
        }

    fun calculateNoneDiscountFee() =
        if (movieType != MovieType.NONE_DISCOUNT) {
            throw IllegalArgumentException()
        } else {
            fee
        }

    fun isDiscountable(whenScreened: LocalDateTime, sequence: Int): Boolean {
        discountConditions.forEach { condition ->
            if (condition.type == DiscountConditionType.PERIOD) {
                if (condition.isDiscountable(whenScreened.dayOfWeek, whenScreened.toLocalTime())) {
                    return true
                }
            } else {
                if (condition.isDiscountable(sequence)) {
                    return true
                }
            }
        }

        return false
    }
}