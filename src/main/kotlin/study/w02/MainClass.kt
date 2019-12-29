//package study.w02
//
//import java.time.Duration
//import java.time.LocalDateTime
//
//fun main() {
//    val theater = Theater(Money.of(100.0))
//    val movie = Movie<AmountDiscount>(
//        "spiderman",
//        Duration.ofMinutes(120L),
//        Money.of(5000.0),
//        AmountSequenceDiscount(Money.of(1000.0), 1)
//    )
//    theater.addMovie(movie)
//    for (day in 7 .. 31) {
//        var seq = 1
//        for (hour in 10 .. 24 step 3) {
//            theater.addSceering(
//                movie,
//                Screening(
//                    seq++,
//                    LocalDateTime.of(2019, 12, day, hour, 0, 0),
//                    100
//                )
//            )
//        }
//    }
//
//    val ticketOffice = TicketOffice(Money.of(0.0))
//    theater.contractTicketOffice(ticketOffice, 10.0)
//    val ticketSeller = TicketSeller(ticketOffice)
//
//    theater.getScreening(movie)?.forEach { screening ->
//        customer.reserve(ticketSeller, theater, movie, screening, 2)
//        val isOk = theater.enter(customer, 2)
//        println(isOk)
//
//        return@forEach
//    }
//}