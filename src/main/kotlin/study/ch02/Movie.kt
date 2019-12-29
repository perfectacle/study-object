package study.ch02

import java.time.Duration

class Movie(
    val title: String,
    val runningTime: Duration,
    val fee: Money,
    val discountPolicy: DiscountPolicy = NoneDiscountPolicy()
) {
    fun calculateMovieFee(screening: Screening) =
        fee.minus(discountPolicy.calculateDiscountAmount(screening))
}
