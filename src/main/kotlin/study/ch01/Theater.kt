package study.ch01

class Theater(
    val fee: Long
) {
    private val ticketOffices: MutableList<TicketOffice> = mutableListOf()
    fun addTicketOffice(ticketOffice: TicketOffice) {
        this.ticketOffices += ticketOffice
    }

    fun setTicket(ticketOffice: TicketOffice, num: Long) {
        if (!this.ticketOffices.contains(ticketOffice)) return
        for (i in 0 until num) {
            // 영화관의 이름을 넣는 게 아니라 객체의 식별자를 넘겨줌
            ticketOffice.addTicket(Ticket(this))
        }
    }

    fun giveInvitation(audience: Audience) {
        // 영화관의 이름을 넣는 게 아니라 객체의 식별자를 넘겨줌
        audience.invitation = Invitation(this)
    }

    fun enter(audience: Audience): Boolean {
        val ticket = audience.ticket
        return ticket.isValid(this)
    }
}