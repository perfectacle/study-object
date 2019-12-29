package study.ch04

import study.ch02.Money
import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    private val whenScreened: LocalDateTime
) {
    fun calculateFee(audienceCount: Int) =
        when (movie.movieType) {
            MovieType.AMOUNT_DISCOUNT -> {
                if (movie.isDiscountable(whenScreened, sequence)) {
                    movie.calculateAmountDiscountFee()
                } else {
                    movie.fee
                }
            }
            MovieType.PERCENT_DISCOUNT -> {
                if (movie.isDiscountable(whenScreened, sequence)) {
                    movie.calculatePercentDiscountFee()
                } else {
                    movie.fee
                }
            }
            MovieType.NONE_DISCOUNT -> {
                movie.calculateNoneDiscountFee().times(audienceCount)
            }
        }
}
