package study.ch02

class AmountDiscountPolicy(
    private val discountAmount: Money,
    conditions: List<DiscountCondition>
): DiscountPolicy(conditions) {
    override fun getDiscountAmount(screening: Screening) = discountAmount
}
