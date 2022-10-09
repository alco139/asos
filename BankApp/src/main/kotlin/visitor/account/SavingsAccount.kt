package visitor.account

import visitor.service.ServiceVisitor

class SavingsAccount : Account {
    override fun accept(serviceVisitor: ServiceVisitor) {
        serviceVisitor.visit(this)
    }
}