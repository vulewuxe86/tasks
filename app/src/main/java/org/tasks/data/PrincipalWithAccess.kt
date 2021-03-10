package org.tasks.data

import androidx.room.Embedded
import androidx.room.Relation

data class PrincipalWithAccess(
    @Embedded val access: PrincipalAccess,
    @Relation(
        parentColumn = "principal",
        entityColumn = "id"
    )
    val principal: Principal
) {
    val displayName get() = principal.displayName
    val list get() = access.list
    val href get() = principal.href
    val inviteStatus get() = access.invite
    val name get() = principal.name
}
