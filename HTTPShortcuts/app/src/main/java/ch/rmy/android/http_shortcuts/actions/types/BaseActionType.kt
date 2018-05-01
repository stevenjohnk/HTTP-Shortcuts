package ch.rmy.android.http_shortcuts.actions.types

import android.content.Context
import ch.rmy.android.http_shortcuts.actions.ActionDTO

abstract class BaseActionType(protected val context: Context) {

    abstract val type: String

    abstract val title: CharSequence

    open val isAvailable = true

    abstract fun fromDTO(actionDTO: ActionDTO): BaseAction

    fun createAction(): BaseAction = fromDTO(ActionDTO(type = type))

}