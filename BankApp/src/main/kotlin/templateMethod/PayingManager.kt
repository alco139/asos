package templateMethod

class PayingManager: PayingEmployees()  {
    override fun paymentOfNetSalary(salary: Double) {
        val managerSalary = salary * 2
        println("You get $managerSalary $")
    }

    override fun getBonuses() {
        val carBonus = 25
        val vacationBonus = 20
        println("Your bonuses are $carBonus car Bonus and $vacationBonus vacationBonus")
    }

    override fun payrollAccounting() {
        super.payrollAccounting()
        println("Manager has lower payroll accounting")
    }
}