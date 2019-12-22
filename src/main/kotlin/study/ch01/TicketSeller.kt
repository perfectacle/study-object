package study.ch01

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.ticket
        val profit = audience.buy(ticket)
        ticketOffice.plusAmount(profit)
    }
}