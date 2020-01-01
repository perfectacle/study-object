package study.w03

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening, count: Int): Boolean
}