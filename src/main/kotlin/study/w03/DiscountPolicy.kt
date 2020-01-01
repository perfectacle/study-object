package study.w03

abstract class DiscountPolicy {
    private val conditions = mutableSetOf<DiscountCondition>()

    operator fun plus(condition: DiscountCondition) {
        conditions.add(condition)
    }

    fun copyPolicy(policy: DiscountPolicy) {
        policy.conditions.addAll(this.conditions)
    }

    fun calculateFee(screening: Screening, count: Int, fee: Money): Money {
        conditions.forEach { condition ->
            if (condition.isSatisfiedBy(screening, count)) return calculateFee(fee)
        }

        return fee
    }

    protected abstract fun calculateFee(fee: Money): Money
}
