package study.ch01

class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket>
) {
    val ticket
        get() = tickets.removeAt(0)

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}