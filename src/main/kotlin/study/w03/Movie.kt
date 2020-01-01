package study.w03

import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    private val policy: DiscountPolicy
) {
    fun calculateFee(screening: Screening, count: Int): Money {
        return policy.calculateFee(screening, count, fee)
    }
}