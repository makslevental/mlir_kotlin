// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$15 {

    static final FunctionDescriptor mlirOperationSetOperand$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation"),
        Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue")
    );
    static final MethodHandle mlirOperationSetOperand$MH = RuntimeHelper.downcallHandle(
        "mlirOperationSetOperand",
        constants$15.mlirOperationSetOperand$FUNC
    );
    static final FunctionDescriptor mlirOperationGetNumResults$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation")
    );
    static final MethodHandle mlirOperationGetNumResults$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetNumResults",
        constants$15.mlirOperationGetNumResults$FUNC
    );
    static final FunctionDescriptor mlirOperationGetResult$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirValue"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirOperationGetResult$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetResult",
        constants$15.mlirOperationGetResult$FUNC
    );
    static final FunctionDescriptor mlirOperationGetNumSuccessors$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation")
    );
    static final MethodHandle mlirOperationGetNumSuccessors$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetNumSuccessors",
        constants$15.mlirOperationGetNumSuccessors$FUNC
    );
    static final FunctionDescriptor mlirOperationGetSuccessor$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirBlock"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirOperationGetSuccessor$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetSuccessor",
        constants$15.mlirOperationGetSuccessor$FUNC
    );
    static final FunctionDescriptor mlirOperationGetNumAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation")
    );
    static final MethodHandle mlirOperationGetNumAttributes$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetNumAttributes",
        constants$15.mlirOperationGetNumAttributes$FUNC
    );
}

