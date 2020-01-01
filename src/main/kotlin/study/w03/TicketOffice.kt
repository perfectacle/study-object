package study.w03

class TicketOffice(
    private var amount: Money
) {
    private val commissionRate = mutableMapOf<Theater, Double>()

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

    fun calculateFee(movie: Movie, screening: Screening, count: Int): Money {
        return movie.calculateFee(screening, count)
    }

    fun reserve(
        theater: Theater,
        movie: Movie,
        screening: Screening,
        count: Int
    ): Reservation {
        if (!commissionRate.containsKey(theater) ||
            !theater.isValidScreening(movie, screening) ||
            !screening.hasSeat(count)) {
            return Reservation.NONE
        }

        val reservation = theater.reserve(movie, screening, count)
        if (reservation != Reservation.NONE) {
            val sales = calculateFee(movie, screening, count)
            val commission = sales * (commissionRate[theater] ?: 0.0)
            amount += commission
            theater.plusAmount(sales - commission)
        }

        return reservation
    }
}
