// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$256 {

    static final FunctionDescriptor LLVMCreateExecutionEngineForModule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateExecutionEngineForModule$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateExecutionEngineForModule",
        constants$256.LLVMCreateExecutionEngineForModule$FUNC
    );
    static final FunctionDescriptor LLVMCreateInterpreterForModule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateInterpreterForModule$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateInterpreterForModule",
        constants$256.LLVMCreateInterpreterForModule$FUNC
    );
    static final FunctionDescriptor LLVMCreateJITCompilerForModule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateJITCompilerForModule$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateJITCompilerForModule",
        constants$256.LLVMCreateJITCompilerForModule$FUNC
    );
    static final FunctionDescriptor LLVMInitializeMCJITCompilerOptions$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMInitializeMCJITCompilerOptions$MH = RuntimeHelper.downcallHandle(
        "LLVMInitializeMCJITCompilerOptions",
        constants$256.LLVMInitializeMCJITCompilerOptions$FUNC
    );
    static final FunctionDescriptor LLVMCreateMCJITCompilerForModule$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateMCJITCompilerForModule$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateMCJITCompilerForModule",
        constants$256.LLVMCreateMCJITCompilerForModule$FUNC
    );
    static final FunctionDescriptor LLVMDisposeExecutionEngine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeExecutionEngine$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeExecutionEngine",
        constants$256.LLVMDisposeExecutionEngine$FUNC
    );
}

