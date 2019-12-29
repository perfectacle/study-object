package study.w02

class Customer(
    private var amount: Money
) {
    var reservation = Reservation.NONE

    fun reserve(ticketSeller: TicketSeller, theater: Theater, movie: Movie, screening: Screening, count: Int) {
        reservation = ticketSeller.reserve(this, theater, movie, screening, count)
    }

    fun hasAmount(amount: Money) = this.amount >= amount

    fun minusAmount(amount: Money) {
        this.amount -= amount
    }
}
