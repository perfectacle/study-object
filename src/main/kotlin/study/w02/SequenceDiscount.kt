package study.w02

abstract class SequenceDiscount<T: DiscountPolicy>(
    private val sequence: Int
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening, audienceCount: Int): Boolean {
        return this.sequence == screening.sequence
    }
}