/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure

data class QBEModule(
    val types: List<QBETypeDefinition>,
    val data: List<QBEData>,
    val functions: List<QBEFunction>)