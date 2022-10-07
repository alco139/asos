package strategy.cards.verifiers

class VerifyAmericanExpressCardService {
    fun verifyCard(number: String) {
        if (number.isEmpty() || number.length < 10) {
            throw Exception()
        }
    }
}