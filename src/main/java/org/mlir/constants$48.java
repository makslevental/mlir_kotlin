// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor mlirIntegerSetGetNumSymbols$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumSymbols$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumSymbols",
        constants$48.mlirIntegerSetGetNumSymbols$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetNumInputs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumInputs$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumInputs",
        constants$48.mlirIntegerSetGetNumInputs$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetNumConstraints$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumConstraints$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumConstraints",
        constants$48.mlirIntegerSetGetNumConstraints$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetNumEqualities$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumEqualities$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumEqualities",
        constants$48.mlirIntegerSetGetNumEqualities$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetNumInequalities$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet")
    );
    static final MethodHandle mlirIntegerSetGetNumInequalities$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetNumInequalities",
        constants$48.mlirIntegerSetGetNumInequalities$FUNC
    );
    static final FunctionDescriptor mlirIntegerSetGetConstraint$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAffineExpr"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirIntegerSet"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirIntegerSetGetConstraint$MH = RuntimeHelper.downcallHandle(
        "mlirIntegerSetGetConstraint",
        constants$48.mlirIntegerSetGetConstraint$FUNC
    );
}


