package study.ch02

class SequenceDiscountCondition(
    private val sequence: Int
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening) = screening.isSequence(sequence)
}