// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor mlirLogicalResultIsFailure$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("value")
        ).withName("MlirLogicalResult")
    );
    static final MethodHandle mlirLogicalResultIsFailure$MH = RuntimeHelper.downcallHandle(
        "mlirLogicalResultIsFailure",
        constants$1.mlirLogicalResultIsFailure$FUNC
    );
    static final FunctionDescriptor mlirLogicalResultSuccess$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("value")
    ).withName("MlirLogicalResult"));
    static final MethodHandle mlirLogicalResultSuccess$MH = RuntimeHelper.downcallHandle(
        "mlirLogicalResultSuccess",
        constants$1.mlirLogicalResultSuccess$FUNC
    );
    static final FunctionDescriptor mlirLogicalResultFailure$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("value")
    ).withName("MlirLogicalResult"));
    static final MethodHandle mlirLogicalResultFailure$MH = RuntimeHelper.downcallHandle(
        "mlirLogicalResultFailure",
        constants$1.mlirLogicalResultFailure$FUNC
    );
    static final FunctionDescriptor mlirTypeIDCreate$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirTypeID"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirTypeIDCreate$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIDCreate",
        constants$1.mlirTypeIDCreate$FUNC
    );
    static final FunctionDescriptor mlirTypeIDIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirTypeID")
    );
    static final MethodHandle mlirTypeIDIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIDIsNull",
        constants$1.mlirTypeIDIsNull$FUNC
    );
    static final FunctionDescriptor mlirTypeIDEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirTypeID"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirTypeID")
    );
    static final MethodHandle mlirTypeIDEqual$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIDEqual",
        constants$1.mlirTypeIDEqual$FUNC
    );
}

