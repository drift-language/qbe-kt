/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.memory

import drift.qbe.structure.QBEGlobal
import drift.qbe.structure.QBELabel
import drift.qbe.structure.QBETemporary

class NameRegister {

    private var labelCounter = 0
    private var dataCounter = 0


    fun temp(id: Int) = QBETemporary("v.$id")
    fun label() = QBELabel("L.${labelCounter++}")
    fun data() = QBEGlobal("D.${dataCounter++}")

    fun resetCounters() {
        labelCounter = 0
        dataCounter = 0
    }
}