package study.ch01

class Bag(
    private var amount: Long = 0,
    private var invitation: Invitation? = null
) {
    var ticket: Ticket? = null

    private fun hasInvitation() = invitation != null

    fun hasTicket() = ticket != null

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun hold(ticket: Ticket): Long {
        this.ticket = ticket
        return if (hasInvitation()) {
            0L
        }
        else {
            minusAmount(ticket.fee)
            ticket.fee
        }
    }
}