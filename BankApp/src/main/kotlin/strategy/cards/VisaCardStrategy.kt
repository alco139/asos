package strategy

class VisaCardStrategy : IBankCardStrategy {
    override fun pay() {
        println("VISA card payment")
    }
}