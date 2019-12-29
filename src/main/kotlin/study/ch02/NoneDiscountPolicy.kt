package study.ch02

class NoneDiscountPolicy: DiscountPolicy() {
    override fun getDiscountAmount(screening: Screening) = Money.ZERO
}
