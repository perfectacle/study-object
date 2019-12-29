package study.w02

abstract class AmountDiscount(
    private val amount: Money
): DiscountPolicy.Amount, DiscountCondition {
    override fun calculateFee(fee: Money): Money {
        return fee.minus(amount)
    }
}