// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$195 {

    static final FunctionDescriptor LLVMGetBufferStart$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetBufferStart$MH = RuntimeHelper.downcallHandle(
        "LLVMGetBufferStart",
        constants$195.LLVMGetBufferStart$FUNC
    );
    static final FunctionDescriptor LLVMGetBufferSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetBufferSize$MH = RuntimeHelper.downcallHandle(
        "LLVMGetBufferSize",
        constants$195.LLVMGetBufferSize$FUNC
    );
    static final FunctionDescriptor LLVMDisposeMemoryBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeMemoryBuffer$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeMemoryBuffer",
        constants$195.LLVMDisposeMemoryBuffer$FUNC
    );
    static final FunctionDescriptor LLVMGetGlobalPassRegistry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMGetGlobalPassRegistry$MH = RuntimeHelper.downcallHandle(
        "LLVMGetGlobalPassRegistry",
        constants$195.LLVMGetGlobalPassRegistry$FUNC
    );
    static final FunctionDescriptor LLVMCreatePassManager$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMCreatePassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMCreatePassManager",
        constants$195.LLVMCreatePassManager$FUNC
    );
    static final FunctionDescriptor LLVMCreateFunctionPassManagerForModule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateFunctionPassManagerForModule$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateFunctionPassManagerForModule",
        constants$195.LLVMCreateFunctionPassManagerForModule$FUNC
    );
}


