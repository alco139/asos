import strategy.Customer
import strategy.cards.Payment
import strategy.cards.AmericanExpressCardStrategy
import strategy.cards.MasterCardCardStrategy
import strategy.cards.VerifyAmericanExpressCardService
import strategy.cards.VisaCardStrategy

fun main(args: Array<String>) {
    val creditCardNumber = "12345"
    val bank = Bank(
        Customer(
            payment = Payment(
                VisaCardStrategy()
            )
        )
    )
    // Strategy
    bank.customer.payment.payByCreditCard(creditCardNumber, 10.0)

    bank.customer.payment.bankCardStrategy =
        AmericanExpressCardStrategy(
            VerifyAmericanExpressCardService()
        )
    bank.customer.payment.payByCreditCard(creditCardNumber, 12.0)
    // Strategy

    // Strategy with lambdas
    bank.customer.payment.bankCardStrategy = MasterCardCardStrategy { cardNumber: String, amount: Double ->
        if (cardNumber.isNotEmpty() && amount > 0.0) {
            println("MasterCard payment successful")
        } else {
            println("Payment failed")
        }
    }
    bank.customer.payment.payByCreditCard(creditCardNumber, 15.0)
    // Strategy with lambdas
}