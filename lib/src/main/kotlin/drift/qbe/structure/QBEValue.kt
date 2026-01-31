/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure

sealed interface QBEValue {

    fun emit(): String
}


sealed interface QBEUsableValue

data class QBETemporary(val name: String) : QBEValue, QBEUsableValue {

    override fun emit(): String = "%$name"
}

data class QBEGlobal(val name: String) : QBEValue {

    override fun emit(): String = "$$name"
}


sealed interface QBEConstant : QBEValue, QBEUsableValue

data class QBEInteger(val value: Long) : QBEConstant {

    override fun emit(): String = "$value"
}

data class QBEFloat(val value: Double) : QBEConstant {

    override fun emit(): String = "$value"
}


data class QBELabel(val name: String) : QBEValue {

    override fun emit(): String = "@$name"
}