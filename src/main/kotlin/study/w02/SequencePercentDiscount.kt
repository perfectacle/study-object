package study.w02

class SequencePercentDiscount(
    sequence: Int,
    private val percent: Money
): SequenceDiscount<DiscountPolicy.Percent>(sequence) {
    override fun calculateFee(fee: Money): Money {
        return fee.minus(fee.multi(percent))
    }
}