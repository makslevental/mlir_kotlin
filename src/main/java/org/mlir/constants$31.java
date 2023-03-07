// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$31 {

    static final FunctionDescriptor mlirOperationImplementsInterfaceStatic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirTypeID")
    );
    static final MethodHandle mlirOperationImplementsInterfaceStatic$MH = RuntimeHelper.downcallHandle(
        "mlirOperationImplementsInterfaceStatic",
        constants$31.mlirOperationImplementsInterfaceStatic$FUNC
    );
    static final FunctionDescriptor mlirInferTypeOpInterfaceTypeID$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirTypeID"));
    static final MethodHandle mlirInferTypeOpInterfaceTypeID$MH = RuntimeHelper.downcallHandleVariadic(
        "mlirInferTypeOpInterfaceTypeID",
        constants$31.mlirInferTypeOpInterfaceTypeID$FUNC
    );
    static final FunctionDescriptor MlirTypesCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MlirTypesCallback$MH = RuntimeHelper.downcallHandle(
        constants$31.MlirTypesCallback$FUNC
    );
    static final FunctionDescriptor mlirInferTypeOpInterfaceInferReturnTypes$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("value")
    ).withName("MlirLogicalResult"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirInferTypeOpInterfaceInferReturnTypes$MH = RuntimeHelper.downcallHandle(
        "mlirInferTypeOpInterfaceInferReturnTypes",
        constants$31.mlirInferTypeOpInterfaceInferReturnTypes$FUNC
    );
    static final FunctionDescriptor mlirRegisterAllDialects$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirDialectRegistry")
    );
    static final MethodHandle mlirRegisterAllDialects$MH = RuntimeHelper.downcallHandle(
        "mlirRegisterAllDialects",
        constants$31.mlirRegisterAllDialects$FUNC
    );
}


