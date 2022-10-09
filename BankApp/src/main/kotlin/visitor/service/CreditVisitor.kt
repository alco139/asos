package visitor.service

import visitor.account.PurposeAccount
import visitor.account.SavingsAccount
import visitor.account.StandardAccount

class CreditVisitor : ServiceVisitor {
    override fun visit(purposeAccount: PurposeAccount) {
        println("Deposit an amount to purpose account.")
    }

    override fun visit(savingsAccount: SavingsAccount) {
        println("Deposit an amount to savings account.")
    }

    override fun visit(standardAccount: StandardAccount) {
        println("Deposit an amount to standard account.")
    }
}