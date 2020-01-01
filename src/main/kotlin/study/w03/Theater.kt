package study.w03

class Theater(
    private var amount: Money
) {
    private val movies: MutableMap<Movie, MutableSet<Screening>> = mutableMapOf()
    private val ticketOffices: MutableSet<TicketOffice> = mutableSetOf()

    companion object {
        val EMPTY = setOf<Screening>()
    }

    fun addMovie(movie: Movie) = if (movies.containsKey(movie)) {
        false
    } else {
        movies[movie] = mutableSetOf()
        true
    }

    fun addScreening(movie: Movie, screening: Screening) =
        if (movies.containsKey(movie)) {
            movies[movie]?.add(screening)
        } else {
            false
        }

    fun contractTicketOffice(ticketOffice: TicketOffice, rate: Double) =
        if (ticketOffice.contract(this, rate)) {
            ticketOffices.add(ticketOffice)
        } else {
            false
        }

    fun plusAmount(amount: Money) {
        this.amount += amount
    }

    fun getScreening(movie: Movie) =
        if (movies.containsKey(movie) && (movies[movie]?.size ?:0) > 0) {
            movies[movie]
        } else {
            EMPTY
        }

    fun isValidScreening(movie: Movie?, screening: Screening?) =
        movies.containsKey(movie) && (movies[movie]?.contains(screening) ?: false)

    fun enter(customer: Customer, count: Int): Boolean {
        val reservation: Reservation = customer.reservation
        return reservation != Reservation.NONE &&
                reservation.theater == this &&
                isValidScreening(reservation.movie, reservation.screening) &&
                reservation.count == count
    }

    fun reserve(movie: Movie, screening: Screening, count: Int) =
        if (!isValidScreening(movie, screening) || !screening.hasSeat(count)) {
            Reservation.NONE
        } else {
            screening.reserveSeat(count)
            Reservation(this, movie, screening, count)
        }
}