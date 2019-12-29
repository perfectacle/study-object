package study.w02

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun reserve(customer: Customer, theater: Theater, movie: Movie, screening: Screening, count: Int): Reservation {
        var reservation = Reservation.NONE
        val price = movie.calculateFee(screening, count)
        if (customer.hasAmount(price)) {
            reservation = ticketOffice.reserve(theater, movie, screening, count)
            if (reservation != Reservation.NONE) customer.minusAmount(price)
        }

        return reservation
    }
}