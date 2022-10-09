package visitor.service

import visitor.account.PurposeAccount
import visitor.account.SavingsAccount
import visitor.account.StandardAccount

interface ServiceVisitor {
    fun visit(purposeAccount: PurposeAccount)
    fun visit(savingsAccount: SavingsAccount)
    fun visit(standardAccount: StandardAccount)
}