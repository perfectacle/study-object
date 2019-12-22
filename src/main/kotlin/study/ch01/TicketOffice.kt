package study.ch01

// Theater만 TicketOffice를 알고, TicketOffice는 Theater를 모른다.
// 따라서 TicketOffice가 서비스(메서드)를 제공해주지 않는 이산 Theater는 아무것도 하지 못한다.
class TicketOffice(
    private var amount: Long
) {
    private val tickets: MutableList<Ticket> = mutableListOf()
    val ticket
        get() = if (tickets.isEmpty()) Ticket.EMPTY
                else tickets.removeAt(0)

    fun addTicket(ticket: Ticket) {
        tickets += ticket
    }

    fun buyTicket(): Ticket {
        val ticket = ticket
        amount += ticket.fee
        return ticket
    }

    // theater에 접근해서 fee를 알아내고 싶지만 단방향 참조를 유지하는 게 좋다.
    fun ticketPrice() =
        if (tickets.isEmpty()) 0L
        else tickets.first().fee
}