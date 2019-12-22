package study.ch01

class Audience(
    private var amount: Long
) {
    var ticket: Ticket = Ticket.EMPTY
    var invitation: Invitation = Invitation.EMPTY

    // 아래 메서드들은 seller가 거래하는데 요구하는 스펙들임.
    // 즉, Audience라는 concrete class일 필요가 없고 아래 조건들을 만족하는 TransactionCondition 인터페이스이기만 하면 Seller는 거래를 함.
    fun hasInvitation() = invitation !== Invitation.EMPTY

    fun removeInvitation() {
        invitation = Invitation.EMPTY
    }

    fun buyTicket(seller: TicketSeller) {
        ticket = seller.getTicket(this)
    }

    fun hasAmount(amount: Long) = this.amount >= amount

    fun minusAmount(amount: Long): Boolean {
        if (amount > this.amount) return false
        this.amount -= amount
        return true
    }
}
