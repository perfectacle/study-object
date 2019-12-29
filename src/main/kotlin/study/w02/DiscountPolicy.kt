package study.w02

interface DiscountPolicy {
    interface Amount: DiscountPolicy
    interface Percent: DiscountPolicy
    interface Count: DiscountPolicy
    interface None: DiscountPolicy
}