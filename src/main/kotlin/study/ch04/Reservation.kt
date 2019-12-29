package study.ch04

import study.ch02.Customer
import study.ch02.Money

class Reservation(
    var customer: Customer,
    var screening: Screening,
    var fee: Money,
    var audienceCount: Int
)