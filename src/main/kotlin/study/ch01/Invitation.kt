package study.ch01

class Invitation(
    val theater: Theater? = null
) {
    companion object {
        val EMPTY: Invitation = Invitation()
    }
}