// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$92 {

    static final FunctionDescriptor LLVMGetNamedMetadataOperands$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNamedMetadataOperands$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNamedMetadataOperands",
        constants$92.LLVMGetNamedMetadataOperands$FUNC
    );
    static final FunctionDescriptor LLVMAddNamedMetadataOperand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMAddNamedMetadataOperand$MH = RuntimeHelper.downcallHandle(
        "LLVMAddNamedMetadataOperand",
        constants$92.LLVMAddNamedMetadataOperand$FUNC
    );
    static final FunctionDescriptor LLVMGetDebugLocDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetDebugLocDirectory$MH = RuntimeHelper.downcallHandle(
        "LLVMGetDebugLocDirectory",
        constants$92.LLVMGetDebugLocDirectory$FUNC
    );
    static final FunctionDescriptor LLVMGetDebugLocFilename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetDebugLocFilename$MH = RuntimeHelper.downcallHandle(
        "LLVMGetDebugLocFilename",
        constants$92.LLVMGetDebugLocFilename$FUNC
    );
    static final FunctionDescriptor LLVMGetDebugLocLine$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetDebugLocLine$MH = RuntimeHelper.downcallHandle(
        "LLVMGetDebugLocLine",
        constants$92.LLVMGetDebugLocLine$FUNC
    );
    static final FunctionDescriptor LLVMGetDebugLocColumn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetDebugLocColumn$MH = RuntimeHelper.downcallHandle(
        "LLVMGetDebugLocColumn",
        constants$92.LLVMGetDebugLocColumn$FUNC
    );
}

