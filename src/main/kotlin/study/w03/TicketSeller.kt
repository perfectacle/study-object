package study.w03

class TicketSeller{
    private lateinit var ticketOffice: TicketOffice

    fun reserve(
        customer: Customer,
        theater: Theater,
        movie: Movie,
        screening: Screening,
        count: Int
    ): Reservation {
        val price = ticketOffice.calculateFee(movie, screening, count)
        return if (customer.hasAmount(price)) {
            val reservation = ticketOffice.reserve(theater, movie, screening, count)
            if (reservation != Reservation.NONE) customer.minusAmount(price)
            return reservation
        } else {
            Reservation.NONE
        }
    }
}