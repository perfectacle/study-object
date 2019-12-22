package study.ch01

fun main() {
    val theater = Theater(100L)
    val audience = Audience(0L)
    val audience2 = Audience(50L)
    val ticketOffice = TicketOffice(0L)
    val seller = TicketSeller(ticketOffice)

    theater.addTicketOffice(ticketOffice)
    theater.setTicket(ticketOffice, 10L)
    theater.giveInvitation(audience2)

    audience.buyTicket(seller)
    audience2.buyTicket(seller)

    println(theater.enter(audience))
    println(theater.enter(audience2))
}