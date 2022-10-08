package templateMethod

abstract class PayingEmployees {
    fun exportHours(hours: Int){
        println("You worked $hours hours")
    }
    open fun payrollAccounting(){
        println("Payroll accounting")
    }
    abstract fun paymentOfNetSalary(salary: Double)
    abstract fun getBonuses()
    fun sendingPayStub(){
        println("Send pay stub")
    }
}