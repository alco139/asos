package strategy.cards

class AmericanExpressCardStrategy(
    private val verifyAmericanExpressCardService: VerifyAmericanExpressCardService
    ) : ICardStrategy {
    override fun pay(cardNumber: String, amount: Double) {
        try {
            verifyAmericanExpressCardService.verifyCard(cardNumber)
            println("American Express card payment")
        } catch (e: Exception) {
            println("American Express card payment not successful")
        }
    }
}