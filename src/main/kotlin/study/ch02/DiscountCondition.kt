package study.ch02

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
