package org.neraquasar.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cat {

    @Id
    @GeneratedValue
    var id: Long? = null

    var name: String? = null
        set(value) {
            field = firstUpperCase(value?.trim() ?: "cat")
        }

    private fun firstUpperCase(string: String): String {
        val length = string.length
        if (length == 0) return string
        if (length == 1) return string.toUpperCase(Locale("UTF-8"))
        return string.substring(0, 1).toUpperCase(Locale("UTF-8")) + string.substring(1)
    }
}
