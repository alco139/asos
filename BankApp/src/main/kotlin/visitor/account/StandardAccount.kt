package visitor.account

import visitor.service.ServiceVisitor

class StandardAccount : Account {
    override fun accept(serviceVisitor: ServiceVisitor) {
        serviceVisitor.visit(this)
    }
}