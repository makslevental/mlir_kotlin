// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor mlirAffineBinaryOpExprGetLHS$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAffineExpr"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineExpr")
    );
    static final MethodHandle mlirAffineBinaryOpExprGetLHS$MH = RuntimeHelper.downcallHandle(
        "mlirAffineBinaryOpExprGetLHS",
        constants$46.mlirAffineBinaryOpExprGetLHS$FUNC
    );
    static final FunctionDescriptor mlirAffineBinaryOpExprGetRHS$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAffineExpr"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAffineExpr")
    );
    static final MethodHandle mlirAffineBinaryOpExprGetRHS$MH = RuntimeHelper.downcallHandle(
        "mlirAffineBinaryOpExprGetRHS",
        constants$46.mlirAffineBinaryOpExprGetRHS$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetContext$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetContext$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetContext",
        constants$46.mlirIntegerSetGetContext$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetIsNull",
        constants$46.mlirIntegerSetIsNull$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetEqual$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetEqual",
        constants$46.mlirIntegerSetEqual$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetPrint$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirIntegerSetPrint$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetPrint",
        constants$46.mlirIntegerSetPrint$FUNC
    );
}

