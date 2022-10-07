package strategy.cards

class VisaCardStrategy : ICardStrategy {
    override fun pay(cardNumber: String, amount: Double) {
        println("VISA card payment")
    }
}

