/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure


data class QBEFunction(
    val export: Boolean,
    val name: String,
    val returnType: QBEType?,
    val parameters: List<QBEParameter>,
    val blocks: List<QBEBlock>) {

    data class QBEParameter(
        val name: String,
        val type: QBEType)
}