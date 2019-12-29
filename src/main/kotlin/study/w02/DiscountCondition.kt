package study.w02

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening, audienceCount: Int): Boolean
    fun calculateFee(fee: Money): Money
}