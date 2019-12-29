package study.ch02

import java.math.BigDecimal

class Money(
    private val amount: BigDecimal
): Comparable<Money> {
    companion object {
        val ZERO = wons(0L)
        fun wons(amount: Long) = Money(BigDecimal.valueOf(amount))
        fun wons(amount: Double) = Money(BigDecimal.valueOf(amount))
    }

    fun plus(amount: Money) = Money(this.amount.add(amount.amount))
    fun minus(amount: Money) = Money(this.amount.subtract(amount.amount))
    fun times(percent: Double) = Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    fun times(percent: Int) = Money(this.amount.multiply(BigDecimal(percent)))
    fun times(percent: Long) = Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    override fun compareTo(other: Money) = amount.compareTo(other.amount)
}
