// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor mlirIntegerSetIsConstraintEq$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirIntegerSetIsConstraintEq$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetIsConstraintEq",
        constants$49.mlirIntegerSetIsConstraintEq$FUNC
    );
    static final FunctionDescriptor mlirAffineMapGetContext$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap")
    );
    static final MethodHandle mlirAffineMapGetContext$MH = RuntimeHelper.downcallHandle(
        "mlirAffineMapGetContext",
        constants$49.mlirAffineMapGetContext$FUNC
    );
    static final FunctionDescriptor mlirAffineMapIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap")
    );
    static final MethodHandle mlirAffineMapIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirAffineMapIsNull",
        constants$49.mlirAffineMapIsNull$FUNC
    );
    static final FunctionDescriptor mlirAffineMapEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap")
    );
    static final MethodHandle mlirAffineMapEqual$MH = RuntimeHelper.downcallHandle(
        "mlirAffineMapEqual",
        constants$49.mlirAffineMapEqual$FUNC
    );
    static final FunctionDescriptor mlirAffineMapPrint$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirAffineMapPrint$MH = RuntimeHelper.downcallHandle(
        "mlirAffineMapPrint",
        constants$49.mlirAffineMapPrint$FUNC
    );
    static final FunctionDescriptor mlirAffineMapDump$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineMap")
    );
    static final MethodHandle mlirAffineMapDump$MH = RuntimeHelper.downcallHandle(
        "mlirAffineMapDump",
        constants$49.mlirAffineMapDump$FUNC
    );
}


