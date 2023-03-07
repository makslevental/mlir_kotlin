// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor mlirContextGetNumLoadedDialects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirContextGetNumLoadedDialects$MH = RuntimeHelper.downcallHandle(
        "mlirContextGetNumLoadedDialects",
        constants$4.mlirContextGetNumLoadedDialects$FUNC
    );
    static final FunctionDescriptor mlirContextGetOrLoadDialect$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirDialect"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirContextGetOrLoadDialect$MH = RuntimeHelper.downcallHandle(
        "mlirContextGetOrLoadDialect",
        constants$4.mlirContextGetOrLoadDialect$FUNC
    );
    static final FunctionDescriptor mlirContextEnableMultithreading$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle mlirContextEnableMultithreading$MH = RuntimeHelper.downcallHandle(
        "mlirContextEnableMultithreading",
        constants$4.mlirContextEnableMultithreading$FUNC
    );
    static final FunctionDescriptor mlirContextLoadAllAvailableDialects$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirContextLoadAllAvailableDialects$MH = RuntimeHelper.downcallHandle(
        "mlirContextLoadAllAvailableDialects",
        constants$4.mlirContextLoadAllAvailableDialects$FUNC
    );
    static final FunctionDescriptor mlirContextIsRegisteredOperation$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirContextIsRegisteredOperation$MH = RuntimeHelper.downcallHandle(
        "mlirContextIsRegisteredOperation",
        constants$4.mlirContextIsRegisteredOperation$FUNC
    );
    static final FunctionDescriptor mlirDialectGetContext$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirDialect")
    );
    static final MethodHandle mlirDialectGetContext$MH = RuntimeHelper.downcallHandle(
        "mlirDialectGetContext",
        constants$4.mlirDialectGetContext$FUNC
    );
}


