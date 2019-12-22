package study.ch01

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    // seller와 audience 사이에 transaction이 있음.
    // 둘 사이의 갑은 seller임, 왜냐하면 audience가 ticket을 원하는 상황이기 때문에 (audience가 seller에게 표를 달라고 징징댈 때 거래가 이뤄짐)
    // 따라서 seller가 서비스(메서드)를 제공해줘야함.
    // audience가 내장을 어느정도 까야지(을로 대해야) seller가 거래를 성사시킴.
    // 또한 표를 어떻게 가져올 것인지에 대한 비즈니스 로직을 가지고 있음 (공짜로 표를 가져올 것인지... audience에게 돈을 까고나서 가져올 것인지...)
    // ticket을 가져오는 변화율이 TicketOffice와는 다르기 때문에 분리한 것임!
    // 변화율을 TicketOffice 한테 주는 게 아니라 그 여파를 TicketSeller란 클래스가 중간에서 쿠션작용을 하는 것임!
    // 변화할 것 같은 부분만 TicketOffice로부터 따로 떼내서 TicketSeller로 만듦!
    fun getTicket(audience: Audience): Ticket {
        var ticket = Ticket.EMPTY

        if (audience.hasInvitation()) {
            ticket = ticketOffice.ticket
            if (ticket.isNotEmpty()) audience.removeInvitation()
        } else if (audience.hasAmount(ticketOffice.ticketPrice())) {
            ticket = ticketOffice.buyTicket()
            if (ticket.isNotEmpty()) audience.minusAmount(ticketOffice.ticketPrice())
        }

        return ticket
    }
}