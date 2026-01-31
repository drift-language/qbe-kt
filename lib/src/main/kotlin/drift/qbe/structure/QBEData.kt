/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure


data class QBEData(
    val name: QBEGlobal,
    val content: List<QBEDataItem>)


sealed interface QBEDataItem {

    fun emit() : String
}

data class QBEDataString(val value: String) : QBEDataItem {

    override fun emit() = "b \"$value\", b 0"
}

data class QBEDataByte(val value: Byte) : QBEDataItem {

    override fun emit() = "b $value"
}

data class QBEDataWord(val value: Int) : QBEDataItem {

    override fun emit() = "w $value"
}

data class QBEDataLong(val value: Long) : QBEDataItem {

    override fun emit() = "l $value"
}

data class QBEDataSingle(val value: Float) : QBEDataItem {

    override fun emit() = "s $value"
}

data class QBEDataDouble(val value: Double) : QBEDataItem {

    override fun emit() = "d $value"
}

data class QBEDataZero(val count: Int) : QBEDataItem {

    override fun emit() = "z $count"
}