// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor mlirTypeIsARankedTensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsARankedTensor$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsARankedTensor",
        constants$62.mlirTypeIsARankedTensor$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAUnrankedTensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAUnrankedTensor$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAUnrankedTensor",
        constants$62.mlirTypeIsAUnrankedTensor$FUNC
    );
    static final FunctionDescriptor mlirRankedTensorTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirRankedTensorTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirRankedTensorTypeGet",
        constants$62.mlirRankedTensorTypeGet$FUNC
    );
    static final FunctionDescriptor mlirRankedTensorTypeGetChecked$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirRankedTensorTypeGetChecked$MH = RuntimeHelper.downcallHandle(
        "mlirRankedTensorTypeGetChecked",
        constants$62.mlirRankedTensorTypeGetChecked$FUNC
    );
    static final FunctionDescriptor mlirRankedTensorTypeGetEncoding$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirRankedTensorTypeGetEncoding$MH = RuntimeHelper.downcallHandle(
        "mlirRankedTensorTypeGetEncoding",
        constants$62.mlirRankedTensorTypeGetEncoding$FUNC
    );
    static final FunctionDescriptor mlirUnrankedTensorTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirUnrankedTensorTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirUnrankedTensorTypeGet",
        constants$62.mlirUnrankedTensorTypeGet$FUNC
    );
}

