// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$7 {

    static final FunctionDescriptor mlirLocationFileLineColGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef"),
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mlirLocationFileLineColGet$MH = RuntimeHelper.downcallHandle(
        "mlirLocationFileLineColGet",
        constants$7.mlirLocationFileLineColGet$FUNC
    );
    static final FunctionDescriptor mlirLocationCallSiteGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirLocationCallSiteGet$MH = RuntimeHelper.downcallHandle(
        "mlirLocationCallSiteGet",
        constants$7.mlirLocationCallSiteGet$FUNC
    );
    static final FunctionDescriptor mlirLocationFusedGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirLocationFusedGet$MH = RuntimeHelper.downcallHandle(
        "mlirLocationFusedGet",
        constants$7.mlirLocationFusedGet$FUNC
    );
    static final FunctionDescriptor mlirLocationNameGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirLocationNameGet$MH = RuntimeHelper.downcallHandle(
        "mlirLocationNameGet",
        constants$7.mlirLocationNameGet$FUNC
    );
    static final FunctionDescriptor mlirLocationUnknownGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirLocationUnknownGet$MH = RuntimeHelper.downcallHandle(
        "mlirLocationUnknownGet",
        constants$7.mlirLocationUnknownGet$FUNC
    );
    static final FunctionDescriptor mlirLocationGetContext$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirLocationGetContext$MH = RuntimeHelper.downcallHandle(
        "mlirLocationGetContext",
        constants$7.mlirLocationGetContext$FUNC
    );
}

