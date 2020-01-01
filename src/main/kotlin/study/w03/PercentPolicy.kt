package study.w03

class PercentPolicy(
    private val percent: Double
): DiscountPolicy() {
    override fun calculateFee(fee: Money): Money {
        return fee - (fee * percent)
    }
}