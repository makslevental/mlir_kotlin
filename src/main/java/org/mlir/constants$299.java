// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$299 {

    static final FunctionDescriptor mlirQuantizedTypeCastToStorageType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeCastToStorageType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeCastToStorageType",
        constants$299.mlirQuantizedTypeCastToStorageType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeCastFromExpressedType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeCastFromExpressedType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeCastFromExpressedType",
        constants$299.mlirQuantizedTypeCastFromExpressedType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeCastToExpressedType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeCastToExpressedType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeCastToExpressedType",
        constants$299.mlirQuantizedTypeCastToExpressedType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeCastExpressedToStorageType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeCastExpressedToStorageType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeCastExpressedToStorageType",
        constants$299.mlirQuantizedTypeCastExpressedToStorageType$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAAnyQuantizedType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAAnyQuantizedType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAAnyQuantizedType",
        constants$299.mlirTypeIsAAnyQuantizedType$FUNC
    );
    static final FunctionDescriptor mlirAnyQuantizedTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirAnyQuantizedTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirAnyQuantizedTypeGet",
        constants$299.mlirAnyQuantizedTypeGet$FUNC
    );
}


