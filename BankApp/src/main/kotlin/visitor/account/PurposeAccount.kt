package visitor.account

import visitor.service.ServiceVisitor

class PurposeAccount : Account {
    override fun accept(serviceVisitor: ServiceVisitor) {
        serviceVisitor.visit(this)
    }
}