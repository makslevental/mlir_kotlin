// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$199 {

    static final FunctionDescriptor LLVMPassManagerBuilderPopulateModulePassManager$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMPassManagerBuilderPopulateModulePassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMPassManagerBuilderPopulateModulePassManager",
        constants$199.LLVMPassManagerBuilderPopulateModulePassManager$FUNC
    );
    static final FunctionDescriptor LLVMGetErrorTypeId$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetErrorTypeId$MH = RuntimeHelper.downcallHandle(
        "LLVMGetErrorTypeId",
        constants$199.LLVMGetErrorTypeId$FUNC
    );
    static final FunctionDescriptor LLVMConsumeError$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMConsumeError$MH = RuntimeHelper.downcallHandle(
        "LLVMConsumeError",
        constants$199.LLVMConsumeError$FUNC
    );
    static final FunctionDescriptor LLVMGetErrorMessage$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetErrorMessage$MH = RuntimeHelper.downcallHandle(
        "LLVMGetErrorMessage",
        constants$199.LLVMGetErrorMessage$FUNC
    );
    static final FunctionDescriptor LLVMDisposeErrorMessage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeErrorMessage$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeErrorMessage",
        constants$199.LLVMDisposeErrorMessage$FUNC
    );
    static final FunctionDescriptor LLVMGetStringErrorTypeId$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMGetStringErrorTypeId$MH = RuntimeHelper.downcallHandle(
        "LLVMGetStringErrorTypeId",
        constants$199.LLVMGetStringErrorTypeId$FUNC
    );
}


