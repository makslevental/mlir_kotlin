// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor mlirLocationIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirLocationIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirLocationIsNull",
        constants$8.mlirLocationIsNull$FUNC
    );
    static final FunctionDescriptor mlirLocationEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirLocationEqual$MH = RuntimeHelper.downcallHandle(
        "mlirLocationEqual",
        constants$8.mlirLocationEqual$FUNC
    );
    static final FunctionDescriptor mlirLocationPrint$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirLocationPrint$MH = RuntimeHelper.downcallHandle(
        "mlirLocationPrint",
        constants$8.mlirLocationPrint$FUNC
    );
    static final FunctionDescriptor mlirModuleCreateEmpty$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirModule"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation")
    );
    static final MethodHandle mlirModuleCreateEmpty$MH = RuntimeHelper.downcallHandle(
        "mlirModuleCreateEmpty",
        constants$8.mlirModuleCreateEmpty$FUNC
    );
    static final FunctionDescriptor mlirModuleCreateParse$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirModule"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirModuleCreateParse$MH = RuntimeHelper.downcallHandle(
        "mlirModuleCreateParse",
        constants$8.mlirModuleCreateParse$FUNC
    );
    static final FunctionDescriptor mlirModuleGetContext$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirModule")
    );
    static final MethodHandle mlirModuleGetContext$MH = RuntimeHelper.downcallHandle(
        "mlirModuleGetContext",
        constants$8.mlirModuleGetContext$FUNC
    );
}


