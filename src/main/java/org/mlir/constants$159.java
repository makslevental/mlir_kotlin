// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$159 {

    static final FunctionDescriptor LLVMInsertBasicBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMInsertBasicBlock$MH = RuntimeHelper.downcallHandle(
        "LLVMInsertBasicBlock",
        constants$159.LLVMInsertBasicBlock$FUNC
    );
    static final FunctionDescriptor LLVMDeleteBasicBlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDeleteBasicBlock$MH = RuntimeHelper.downcallHandle(
        "LLVMDeleteBasicBlock",
        constants$159.LLVMDeleteBasicBlock$FUNC
    );
    static final FunctionDescriptor LLVMRemoveBasicBlockFromParent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMRemoveBasicBlockFromParent$MH = RuntimeHelper.downcallHandle(
        "LLVMRemoveBasicBlockFromParent",
        constants$159.LLVMRemoveBasicBlockFromParent$FUNC
    );
    static final FunctionDescriptor LLVMMoveBasicBlockBefore$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveBasicBlockBefore$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveBasicBlockBefore",
        constants$159.LLVMMoveBasicBlockBefore$FUNC
    );
    static final FunctionDescriptor LLVMMoveBasicBlockAfter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveBasicBlockAfter$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveBasicBlockAfter",
        constants$159.LLVMMoveBasicBlockAfter$FUNC
    );
    static final FunctionDescriptor LLVMGetFirstInstruction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetFirstInstruction$MH = RuntimeHelper.downcallHandle(
        "LLVMGetFirstInstruction",
        constants$159.LLVMGetFirstInstruction$FUNC
    );
}


