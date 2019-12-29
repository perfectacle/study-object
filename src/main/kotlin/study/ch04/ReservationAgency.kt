package study.ch04

import study.ch02.Customer

class ReservationAgency {
    fun reserve(
        screening: Screening,
        customer: Customer,
        audienceCount: Int
    ): Reservation {
        val fee = screening.calculateFee(audienceCount)

        return Reservation(customer, screening, fee, audienceCount)
    }
}