package strategy.cards

import strategy.cards.ICardStrategy

class Payment(
    var bankCardStrategy: ICardStrategy,
) {
    fun payByCreditCard(number: String, amount: Double) {
        bankCardStrategy.pay(number, amount)
    }
}