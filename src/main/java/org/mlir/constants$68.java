// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$68 {

    static final FunctionDescriptor mlirTypeIsATransformOperationType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsATransformOperationType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsATransformOperationType",
        constants$68.mlirTypeIsATransformOperationType$FUNC
    );
    static final FunctionDescriptor mlirTransformOperationTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirTransformOperationTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirTransformOperationTypeGet",
        constants$68.mlirTransformOperationTypeGet$FUNC
    );
    static final FunctionDescriptor mlirTransformOperationTypeGetOperationName$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTransformOperationTypeGetOperationName$MH = RuntimeHelper.downcallHandle(
        "mlirTransformOperationTypeGetOperationName",
        constants$68.mlirTransformOperationTypeGetOperationName$FUNC
    );
    static final FunctionDescriptor LLVMInitializeAArch64TargetInfo$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LLVMInitializeAArch64TargetInfo$MH = RuntimeHelper.downcallHandle(
        "LLVMInitializeAArch64TargetInfo",
        constants$68.LLVMInitializeAArch64TargetInfo$FUNC
    );
    static final FunctionDescriptor LLVMInitializeAArch64Target$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LLVMInitializeAArch64Target$MH = RuntimeHelper.downcallHandle(
        "LLVMInitializeAArch64Target",
        constants$68.LLVMInitializeAArch64Target$FUNC
    );
    static final FunctionDescriptor LLVMInitializeAArch64TargetMC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LLVMInitializeAArch64TargetMC$MH = RuntimeHelper.downcallHandle(
        "LLVMInitializeAArch64TargetMC",
        constants$68.LLVMInitializeAArch64TargetMC$FUNC
    );
}


