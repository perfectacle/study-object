package study.w03

class AmountPolicy(
    private val amount: Money
): DiscountPolicy() {
    override fun calculateFee(fee: Money): Money {
        return fee - amount
    }
}