package visitor.service

import visitor.account.PurposeAccount
import visitor.account.SavingsAccount
import visitor.account.StandardAccount

class BalanceVisitor : ServiceVisitor {
    override fun visit(purposeAccount: PurposeAccount) {
        println("Showing balance of purpose account.")
    }

    override fun visit(savingsAccount: SavingsAccount) {
        println("Showing balance of savings account.")
    }

    override fun visit(standardAccount: StandardAccount) {
        println("Showing balance of standard account.")
    }
}