// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor LLVMCreateFunctionPassManager$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateFunctionPassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateFunctionPassManager",
        constants$196.LLVMCreateFunctionPassManager$FUNC
    );
    static final FunctionDescriptor LLVMRunPassManager$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMRunPassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMRunPassManager",
        constants$196.LLVMRunPassManager$FUNC
    );
    static final FunctionDescriptor LLVMInitializeFunctionPassManager$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMInitializeFunctionPassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMInitializeFunctionPassManager",
        constants$196.LLVMInitializeFunctionPassManager$FUNC
    );
    static final FunctionDescriptor LLVMRunFunctionPassManager$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMRunFunctionPassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMRunFunctionPassManager",
        constants$196.LLVMRunFunctionPassManager$FUNC
    );
    static final FunctionDescriptor LLVMFinalizeFunctionPassManager$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMFinalizeFunctionPassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMFinalizeFunctionPassManager",
        constants$196.LLVMFinalizeFunctionPassManager$FUNC
    );
    static final FunctionDescriptor LLVMDisposePassManager$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposePassManager$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposePassManager",
        constants$196.LLVMDisposePassManager$FUNC
    );
}


