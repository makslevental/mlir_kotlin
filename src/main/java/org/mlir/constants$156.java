// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$156 {

    static final FunctionDescriptor LLVMValueIsBasicBlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMValueIsBasicBlock$MH = RuntimeHelper.downcallHandle(
        "LLVMValueIsBasicBlock",
        constants$156.LLVMValueIsBasicBlock$FUNC
    );
    static final FunctionDescriptor LLVMValueAsBasicBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMValueAsBasicBlock$MH = RuntimeHelper.downcallHandle(
        "LLVMValueAsBasicBlock",
        constants$156.LLVMValueAsBasicBlock$FUNC
    );
    static final FunctionDescriptor LLVMGetBasicBlockName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetBasicBlockName$MH = RuntimeHelper.downcallHandle(
        "LLVMGetBasicBlockName",
        constants$156.LLVMGetBasicBlockName$FUNC
    );
    static final FunctionDescriptor LLVMGetBasicBlockParent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetBasicBlockParent$MH = RuntimeHelper.downcallHandle(
        "LLVMGetBasicBlockParent",
        constants$156.LLVMGetBasicBlockParent$FUNC
    );
    static final FunctionDescriptor LLVMGetBasicBlockTerminator$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetBasicBlockTerminator$MH = RuntimeHelper.downcallHandle(
        "LLVMGetBasicBlockTerminator",
        constants$156.LLVMGetBasicBlockTerminator$FUNC
    );
    static final FunctionDescriptor LLVMCountBasicBlocks$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCountBasicBlocks$MH = RuntimeHelper.downcallHandle(
        "LLVMCountBasicBlocks",
        constants$156.LLVMCountBasicBlocks$FUNC
    );
}


