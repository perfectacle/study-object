package study.ch02

class PercentDiscountPolicy(
    private val percent: Double,
    conditions: List<DiscountCondition>
): DiscountPolicy(conditions) {
    override fun getDiscountAmount(screening: Screening) =
        screening.movieFee.times(percent)
}
