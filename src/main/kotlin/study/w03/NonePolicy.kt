package study.w03

class NonePolicy: DiscountPolicy() {
    override fun calculateFee(fee: Money): Money {
        return fee
    }
}