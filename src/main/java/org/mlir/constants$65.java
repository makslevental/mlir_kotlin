// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor mlirUnrankedMemrefGetMemorySpace$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirUnrankedMemrefGetMemorySpace$MH = RuntimeHelper.downcallHandle(
        "mlirUnrankedMemrefGetMemorySpace",
        constants$65.mlirUnrankedMemrefGetMemorySpace$FUNC
    );
    static final FunctionDescriptor mlirTypeIsATuple$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsATuple$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsATuple",
        constants$65.mlirTypeIsATuple$FUNC
    );
    static final FunctionDescriptor mlirTupleTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirTupleTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirTupleTypeGet",
        constants$65.mlirTupleTypeGet$FUNC
    );
    static final FunctionDescriptor mlirTupleTypeGetNumTypes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTupleTypeGetNumTypes$MH = RuntimeHelper.downcallHandle(
        "mlirTupleTypeGetNumTypes",
        constants$65.mlirTupleTypeGetNumTypes$FUNC
    );
    static final FunctionDescriptor mlirTupleTypeGetType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirTupleTypeGetType$MH = RuntimeHelper.downcallHandle(
        "mlirTupleTypeGetType",
        constants$65.mlirTupleTypeGetType$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAFunction$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAFunction$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAFunction",
        constants$65.mlirTypeIsAFunction$FUNC
    );
}


