package study.w02

class SequenceAmountDiscount(
    sequence: Int,
    private val amount: Money
): SequenceDiscount<DiscountPolicy.Amount>(sequence) {
    override fun calculateFee(fee: Money): Money {
        return fee.minus(amount)
    }
}