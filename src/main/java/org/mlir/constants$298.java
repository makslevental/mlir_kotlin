// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$298 {

    static final FunctionDescriptor mlirQuantizedTypeGetStorageTypeMin$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeGetStorageTypeMin$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeGetStorageTypeMin",
        constants$298.mlirQuantizedTypeGetStorageTypeMin$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeGetStorageTypeMax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeGetStorageTypeMax$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeGetStorageTypeMax",
        constants$298.mlirQuantizedTypeGetStorageTypeMax$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeGetStorageTypeIntegralWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeGetStorageTypeIntegralWidth$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeGetStorageTypeIntegralWidth",
        constants$298.mlirQuantizedTypeGetStorageTypeIntegralWidth$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeIsCompatibleExpressedType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeIsCompatibleExpressedType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeIsCompatibleExpressedType",
        constants$298.mlirQuantizedTypeIsCompatibleExpressedType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeGetQuantizedElementType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeGetQuantizedElementType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeGetQuantizedElementType",
        constants$298.mlirQuantizedTypeGetQuantizedElementType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeCastFromStorageType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirQuantizedTypeCastFromStorageType$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeCastFromStorageType",
        constants$298.mlirQuantizedTypeCastFromStorageType$FUNC
    );
}


