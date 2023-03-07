// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$343 {

    static final FunctionDescriptor mlirDenseI32ArrayGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirDenseI32ArrayGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseI32ArrayGet",
        constants$343.mlirDenseI32ArrayGet$FUNC
    );
    static final FunctionDescriptor mlirDenseI64ArrayGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirDenseI64ArrayGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseI64ArrayGet",
        constants$343.mlirDenseI64ArrayGet$FUNC
    );
    static final FunctionDescriptor mlirDenseF32ArrayGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirDenseF32ArrayGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseF32ArrayGet",
        constants$343.mlirDenseF32ArrayGet$FUNC
    );
    static final FunctionDescriptor mlirDenseF64ArrayGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirDenseF64ArrayGet$MH = RuntimeHelper.downcallHandle(
        "mlirDenseF64ArrayGet",
        constants$343.mlirDenseF64ArrayGet$FUNC
    );
    static final FunctionDescriptor mlirDenseArrayGetNumElements$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirDenseArrayGetNumElements$MH = RuntimeHelper.downcallHandle(
        "mlirDenseArrayGetNumElements",
        constants$343.mlirDenseArrayGetNumElements$FUNC
    );
    static final FunctionDescriptor mlirDenseBoolArrayGetElement$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirDenseBoolArrayGetElement$MH = RuntimeHelper.downcallHandle(
        "mlirDenseBoolArrayGetElement",
        constants$343.mlirDenseBoolArrayGetElement$FUNC
    );
}

