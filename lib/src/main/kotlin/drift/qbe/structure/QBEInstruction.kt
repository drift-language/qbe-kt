/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure


sealed interface QBEInstruction


data class QBEControlFlow(
    val operation: QBEOpcode,
    val structures: List<QBEValue>) : QBEInstruction


sealed interface QBEOperation : QBEInstruction {
    val destination: QBETemporary
    val type: QBEType
    val operation: QBEOpcode
}

data class QBEUnary(
    override val destination: QBETemporary,
    override val type: QBEType,
    override val operation: QBEOpcode,
    val operand: QBEUsableValue) : QBEOperation


data class QBEBinary(
    override val destination: QBETemporary,
    override val type: QBEType,
    override val operation: QBEOpcode,
    val operands: Pair<QBEUsableValue, QBEUsableValue>) : QBEOperation
