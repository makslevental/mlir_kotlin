// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor mlirOpResultGetResultNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue")
    );
    static final MethodHandle mlirOpResultGetResultNumber$MH = RuntimeHelper.downcallHandle(
        "mlirOpResultGetResultNumber",
        constants$24.mlirOpResultGetResultNumber$FUNC
    );
    static final FunctionDescriptor mlirValueGetType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue")
    );
    static final MethodHandle mlirValueGetType$MH = RuntimeHelper.downcallHandle(
        "mlirValueGetType",
        constants$24.mlirValueGetType$FUNC
    );
    static final FunctionDescriptor mlirValueDump$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue")
    );
    static final MethodHandle mlirValueDump$MH = RuntimeHelper.downcallHandle(
        "mlirValueDump",
        constants$24.mlirValueDump$FUNC
    );
    static final FunctionDescriptor mlirValuePrint$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirValuePrint$MH = RuntimeHelper.downcallHandle(
        "mlirValuePrint",
        constants$24.mlirValuePrint$FUNC
    );
    static final FunctionDescriptor mlirValueGetFirstUse$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirOpOperand"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirValue")
    );
    static final MethodHandle mlirValueGetFirstUse$MH = RuntimeHelper.downcallHandle(
        "mlirValueGetFirstUse",
        constants$24.mlirValueGetFirstUse$FUNC
    );
    static final FunctionDescriptor mlirOpOperandIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOpOperand")
    );
    static final MethodHandle mlirOpOperandIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirOpOperandIsNull",
        constants$24.mlirOpOperandIsNull$FUNC
    );
}


