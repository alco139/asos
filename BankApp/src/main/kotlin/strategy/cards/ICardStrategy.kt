package strategy.cards

interface ICardStrategy {
    fun pay(cardNumber: String, amount: Double)
}