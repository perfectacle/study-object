package study.ch01

class Ticket(
    private val theater: Theater? = null
) {
    // Maintenance of State, 자기 상태를 자기가 관리함.
    private var isEntered: Boolean = false

    companion object {
        // null 대신에 객체로써 식별하기 위해 만듦.
        val EMPTY: Ticket = Ticket()
    }

    // theater의 fee를 확정시켜놓는 게 아니라 fee를 구할 때마다 theater 식별자에 접근해서 fee를 물어봄
    // theater의 fee가 변경됐을 때 변경이 ticket에도 적용되기 위해서... (Ticket 발행 당시의 스냅샷이 아닌가봄)
    // Pointer of Pointer가 여기 쓰였음
    val fee: Long
        get() = theater?.fee ?: 0L

    fun isValid(theater: Theater) =
        if (isEntered || this.theater !== theater || this === EMPTY) {
            false
        }
        else {
            isEntered = true
            true
        }

    fun isNotEmpty() = this !== EMPTY
}