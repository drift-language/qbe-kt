/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure

sealed interface QBEType {
    val code: String
}

sealed interface QBEConstantType


data object QBEWord : QBEType, QBEConstantType {
    override val code = "w"
}

data object QBELong : QBEType, QBEConstantType {
    override val code = "l"
}

data object QBESingle : QBEType, QBEConstantType {
    override val code = "s"
}

data object QBEDouble : QBEType, QBEConstantType {
    override val code = "d"
}

data class QBEAggregate(val name: String): QBEType {
    override val code = ":$name"
}