package visitor.service

import visitor.account.PurposeAccount
import visitor.account.SavingsAccount
import visitor.account.StandardAccount

class DebitVisitor : ServiceVisitor {
    override fun visit(purposeAccount: PurposeAccount) {
        println("Withdraw an amount from purpose account.")
    }

    override fun visit(savingsAccount: SavingsAccount) {
        println("Withdraw an amount from savings account.")
    }

    override fun visit(standardAccount: StandardAccount) {
        println("Withdraw an amount from standard account.")
    }
}