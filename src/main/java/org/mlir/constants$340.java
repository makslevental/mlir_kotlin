// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$340 {

    static final FunctionDescriptor mlirTypeAttrGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeAttrGet$MH = RuntimeHelper.downcallHandle(
        "mlirTypeAttrGet",
        constants$340.mlirTypeAttrGet$FUNC
    );
    static final FunctionDescriptor mlirTypeAttrGetValue$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirTypeAttrGetValue$MH = RuntimeHelper.downcallHandle(
        "mlirTypeAttrGetValue",
        constants$340.mlirTypeAttrGetValue$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsAUnit$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsAUnit$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsAUnit",
        constants$340.mlirAttributeIsAUnit$FUNC
    );
    static final FunctionDescriptor mlirUnitAttrGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirUnitAttrGet$MH = RuntimeHelper.downcallHandle(
        "mlirUnitAttrGet",
        constants$340.mlirUnitAttrGet$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsAElements$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsAElements$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsAElements",
        constants$340.mlirAttributeIsAElements$FUNC
    );
    static final FunctionDescriptor mlirElementsAttrGetValue$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirElementsAttrGetValue$MH = RuntimeHelper.downcallHandle(
        "mlirElementsAttrGetValue",
        constants$340.mlirElementsAttrGetValue$FUNC
    );
}


