package study.w03

class Money(
    private val amount: Double
): Comparable<Money> {
    operator fun minus(other: Money) = Money(
        if (this.amount > other.amount) {
            this.amount - other.amount
        } else {
            0.0
        }
    )

    operator fun plus(other: Money) = Money(this.amount + other.amount)

    operator fun times(amount: Double) = Money(this.amount * amount)

    override fun compareTo(other: Money) = when {
        this.amount > other.amount -> 1
        this.amount < other.amount -> -1
        else -> 0
    }

    companion object {
        fun of(amount: Double) = Money(amount)
    }
}
