package study.w03

class Reservation(
    val theater: Theater?,
    val movie: Movie?,
    val screening: Screening?,
    val count: Int
) {
    companion object {
        val NONE = Reservation(null, null, null, 0)
    }
}