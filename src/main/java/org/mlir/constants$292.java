// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$292 {

    static final FunctionDescriptor mlirTypeIsAPDLRangeType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAPDLRangeType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAPDLRangeType",
        constants$292.mlirTypeIsAPDLRangeType$FUNC
    );
    static final FunctionDescriptor mlirPDLRangeTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirPDLRangeTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirPDLRangeTypeGet",
        constants$292.mlirPDLRangeTypeGet$FUNC
    );
    static final FunctionDescriptor mlirPDLRangeTypeGetElementType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirPDLRangeTypeGetElementType$MH = RuntimeHelper.downcallHandle(
        "mlirPDLRangeTypeGetElementType",
        constants$292.mlirPDLRangeTypeGetElementType$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAPDLTypeType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAPDLTypeType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAPDLTypeType",
        constants$292.mlirTypeIsAPDLTypeType$FUNC
    );
    static final FunctionDescriptor mlirPDLTypeTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirPDLTypeTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirPDLTypeTypeGet",
        constants$292.mlirPDLTypeTypeGet$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAPDLValueType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAPDLValueType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAPDLValueType",
        constants$292.mlirTypeIsAPDLValueType$FUNC
    );
}


