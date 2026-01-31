/******************************************************************************
 * Drift Programming Language                                                 *
 *                                                                            *
 * Copyright (c) 2026. Jonathan (GitHub: belicfr)                             *
 *                                                                            *
 * This source code is licensed under the MIT License.                        *
 * See the LICENSE file in the root directory for details.                    *
 ******************************************************************************/
package drift.qbe.structure

enum class QBEOpcode(val code: String) {

    /* Arithmetic */
    ADD("add"),
    SUB("sub"),
    MUL("mul"),
    DIV("div"),
    UDIV("udiv"),
    REM("rem"),
    UREM("urem"),
    NEG("neg"),

    /* Bitwise */
    AND("and"),
    OR("or"),
    XOR("xor"),
    SAR("sar"),
    SHR("shr"),
    SHL("shl"),

    /* Comparison (word) */
    CEQW("ceqw"),
    CNEW("cnew"),
    CSLTW("csltw"),
    CSLEW("cslew"),
    CSGTW("csgtw"),
    CSGEW("csgew"),
    CULTW("cultw"),
    CULEW("culew"),
    CUGTW("cugtw"),
    CUGEW("cugew"),

    /* Comparison (long) */
    CEQL("ceql"),
    CNEL("cnel"),
    CSLTL("csltl"),
    CSLEL("cslel"),
    CSGTL("csgtl"),
    CSGEL("csgel"),
    CULTL("cultl"),
    CULEL("culel"),
    CUGTL("cugtl"),
    CUGEL("cugel"),

    /* Comparison (single) */
    CEQS("ceqs"),
    CNES("cnes"),
    CLTS("clts"),
    CLES("cles"),
    CGTS("cgts"),
    CGES("cges"),
    COS("cos"),
    CUOS("cuos"),

    /* Comparison (double) */
    CEQD("ceqd"),
    CNED("cned"),
    CLTD("cltd"),
    CLED("cled"),
    CGTD("cgtd"),
    CGED("cged"),
    COD("cod"),
    CUOD("cuod"),

    /* Memory */
    LOAD("load"),
    STOREW("storew"),
    STOREH("storeh"),
    STOREB("storeb"),
    STORES("stores"),
    STORED("stored"),
    STOREL("storel"),
    ALLOC4("alloc4"),
    ALLOC8("alloc8"),
    ALLOC16("alloc16"),
    BLIT("blit"),

    /* Conversions */
    EXTSW("extsw"),
    EXTUW("extuw"),
    EXTSH("extsh"),
    EXTUH("extuh"),
    EXTSB("extsb"),
    EXTUB("extub"),
    EXTS("exts"),
    TRUNCD("truncd"),
    STOSI("stosi"),
    STOUI("stoui"),
    DTOSI("dtosi"),
    DTOUI("dtoui"),
    SWTOF("swtof"),
    UWTOF("uwtof"),
    SLTOF("sltof"),
    ULTOF("ultof"),
    CAST("cast"),

    /* Other */
    COPY("copy"),
    CALL("call"),

    /* Control flow */
    JMP("jmp"),
    JNZ("jnz"),
    RET("ret"),
    HLT("hlt"),
}