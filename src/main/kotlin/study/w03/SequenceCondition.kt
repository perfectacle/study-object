package study.w03

class SequenceCondition(
    private val sequence: Int
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening, count: Int): Boolean {
        return sequence == screening.sequence
    }
}