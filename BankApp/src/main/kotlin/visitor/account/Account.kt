package visitor.account

import visitor.service.ServiceVisitor

interface Account {
    fun accept (serviceVisitor: ServiceVisitor)
}