package templateMethod

class PayingBanker: PayingEmployees() {

    override fun paymentOfNetSalary(salary: Double) {
        val bankerSalary = salary * 1.1
        println("You get $bankerSalary $")
    }

    override fun getBonuses() {
        println("You have no bonuses")
    }
}