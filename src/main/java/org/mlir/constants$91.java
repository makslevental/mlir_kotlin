// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$91 {

    static final FunctionDescriptor LLVMGetNextNamedMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNextNamedMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNextNamedMetadata",
        constants$91.LLVMGetNextNamedMetadata$FUNC
    );
    static final FunctionDescriptor LLVMGetPreviousNamedMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetPreviousNamedMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMGetPreviousNamedMetadata",
        constants$91.LLVMGetPreviousNamedMetadata$FUNC
    );
    static final FunctionDescriptor LLVMGetNamedMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMGetNamedMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNamedMetadata",
        constants$91.LLVMGetNamedMetadata$FUNC
    );
    static final FunctionDescriptor LLVMGetOrInsertNamedMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMGetOrInsertNamedMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMGetOrInsertNamedMetadata",
        constants$91.LLVMGetOrInsertNamedMetadata$FUNC
    );
    static final FunctionDescriptor LLVMGetNamedMetadataName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNamedMetadataName$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNamedMetadataName",
        constants$91.LLVMGetNamedMetadataName$FUNC
    );
    static final FunctionDescriptor LLVMGetNamedMetadataNumOperands$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNamedMetadataNumOperands$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNamedMetadataNumOperands",
        constants$91.LLVMGetNamedMetadataNumOperands$FUNC
    );
}


