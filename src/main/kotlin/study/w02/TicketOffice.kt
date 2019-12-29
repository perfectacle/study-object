package study.w02

class TicketOffice(
    private var amount: Money
) {
    private val commissionRate: MutableMap<Theater, Double> = mutableMapOf()

    fun contract(theater: Theater, rate: Double) =
        if (commissionRate.containsKey(theater)) {
            false
        } else {
            commissionRate[theater] = rate
            true
        }

    fun cancel(theater: Theater) = if (!commissionRate.containsKey(theater)) {
        false
    } else {
        commissionRate.remove(theater)
        true
    }

    fun reserve(theater: Theater, movie: Movie, screening: Screening, count: Int): Reservation {
        if (!commissionRate.containsKey(theater) ||
                !theater.isValidScreening(movie, screening) ||
                !screening.hasSeat(count)) {
            return Reservation.NONE
        }

        val reservation = theater.reserve(movie, screening, count)
        if (reservation != Reservation.NONE) {
            val sales = movie.calculateFee(screening, count)
            val commission = sales * (commissionRate[theater] ?: 0.0)
            amount += commission
            theater.plusAmount(sales - commission)
        }

        return reservation
    }
}