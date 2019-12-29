package study.w02

class AmountSequenceDiscount(
    amount: Money,
    private val sequence: Int
): AmountDiscount(amount) {
    override fun isSatisfiedBy(screening: Screening, audienceCount: Int): Boolean {
        return screening.sequence == sequence
    }
}