// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor mlirIntegerSetDump$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetDump$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetDump",
        constants$47.mlirIntegerSetDump$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetEmptyGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirIntegerSet"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirIntegerSetEmptyGet$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetEmptyGet",
        constants$47.mlirIntegerSetEmptyGet$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirIntegerSet"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirIntegerSetGet$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGet",
        constants$47.mlirIntegerSetGet$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetReplaceGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirIntegerSet"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirIntegerSetReplaceGet$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetReplaceGet",
        constants$47.mlirIntegerSetReplaceGet$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetIsCanonicalEmpty$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetIsCanonicalEmpty$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetIsCanonicalEmpty",
        constants$47.mlirIntegerSetIsCanonicalEmpty$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetNumDims$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumDims$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumDims",
        constants$47.mlirIntegerSetGetNumDims$FUNC
    );
}


