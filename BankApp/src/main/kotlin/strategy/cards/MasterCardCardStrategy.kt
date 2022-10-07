package strategy.cards

class MasterCardCardStrategy(
    var paymentStrategy: ((String, Double) -> Unit)
) : ICardStrategy {
    override fun pay(cardNumber: String, amount: Double) {
        paymentStrategy(cardNumber, amount)
    }
}