package strategy

class AmericanExpressCardStrategy : IBankCardStrategy {
    override fun pay() {
        println("American Express card payment")
    }
}