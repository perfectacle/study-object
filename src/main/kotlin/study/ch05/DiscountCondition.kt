package study.ch05

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
