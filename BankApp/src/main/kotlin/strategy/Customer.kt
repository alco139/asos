package strategy

import strategy.cards.Payment
import strategy.lamdas.LambdaPayment

class Customer(
    var payment: Payment,
    var lambdaPayment: LambdaPayment? = null,
)