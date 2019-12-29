package study.ch02

import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    val whenScreened: LocalDateTime
) {
    val movieFee: Money
        get() = movie.fee

    fun isSequence(sequence: Int) = this.sequence == sequence

    fun reserve(customer: Customer, audienceCount: Int) =
        Reservation(customer, this, calculateFee(audienceCount), audienceCount)

    private fun calculateFee(audienceCount: Int): Money =
        movie.calculateMovieFee(this).times(audienceCount)
}