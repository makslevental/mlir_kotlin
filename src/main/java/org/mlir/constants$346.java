// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$346 {

    static final FunctionDescriptor mlirDenseElementsAttrBoolSplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrBoolSplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrBoolSplatGet",
        constants$346.mlirDenseElementsAttrBoolSplatGet$FUNC
    );
    static final FunctionDescriptor mlirDenseElementsAttrUInt8SplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrUInt8SplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrUInt8SplatGet",
        constants$346.mlirDenseElementsAttrUInt8SplatGet$FUNC
    );
    static final FunctionDescriptor mlirDenseElementsAttrInt8SplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrInt8SplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrInt8SplatGet",
        constants$346.mlirDenseElementsAttrInt8SplatGet$FUNC
    );
    static final FunctionDescriptor mlirDenseElementsAttrUInt32SplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrUInt32SplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrUInt32SplatGet",
        constants$346.mlirDenseElementsAttrUInt32SplatGet$FUNC
    );
    static final FunctionDescriptor mlirDenseElementsAttrInt32SplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrInt32SplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrInt32SplatGet",
        constants$346.mlirDenseElementsAttrInt32SplatGet$FUNC
    );
    static final FunctionDescriptor mlirDenseElementsAttrUInt64SplatGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirDenseElementsAttrUInt64SplatGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseElementsAttrUInt64SplatGet",
        constants$346.mlirDenseElementsAttrUInt64SplatGet$FUNC
    );
}


