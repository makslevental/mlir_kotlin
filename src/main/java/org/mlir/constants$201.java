// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$201 {

    static final FunctionDescriptor LLVMGetTargetDescription$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetTargetDescription$MH = RuntimeHelper.downcallHandle(
        "LLVMGetTargetDescription",
        constants$201.LLVMGetTargetDescription$FUNC
    );
    static final FunctionDescriptor LLVMTargetHasJIT$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMTargetHasJIT$MH = RuntimeHelper.downcallHandle(
        "LLVMTargetHasJIT",
        constants$201.LLVMTargetHasJIT$FUNC
    );
    static final FunctionDescriptor LLVMTargetHasTargetMachine$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMTargetHasTargetMachine$MH = RuntimeHelper.downcallHandle(
        "LLVMTargetHasTargetMachine",
        constants$201.LLVMTargetHasTargetMachine$FUNC
    );
    static final FunctionDescriptor LLVMTargetHasAsmBackend$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMTargetHasAsmBackend$MH = RuntimeHelper.downcallHandle(
        "LLVMTargetHasAsmBackend",
        constants$201.LLVMTargetHasAsmBackend$FUNC
    );
    static final FunctionDescriptor LLVMCreateTargetMachine$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMCreateTargetMachine$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateTargetMachine",
        constants$201.LLVMCreateTargetMachine$FUNC
    );
    static final FunctionDescriptor LLVMDisposeTargetMachine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeTargetMachine$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeTargetMachine",
        constants$201.LLVMDisposeTargetMachine$FUNC
    );
}


