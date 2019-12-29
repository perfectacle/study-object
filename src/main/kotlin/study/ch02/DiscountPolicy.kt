package study.ch02

abstract class DiscountPolicy(
    private val conditions: List<DiscountCondition> = listOf()
) {
    fun calculateDiscountAmount(screening: Screening): Money {
        conditions.forEach { condition ->
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    abstract fun getDiscountAmount(screening: Screening): Money
}
