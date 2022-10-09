package strategy.lamdas

class LambdaPayment(
    var paymentStrategy: ((String, Double) -> Unit),
) {
    fun payByCreditCard(number: String, amount: Double) {
        paymentStrategy(number, amount)
    }
}


