// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$80 {

    static final FunctionDescriptor LLVMShutdown$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LLVMShutdown$MH = RuntimeHelper.downcallHandle(
        "LLVMShutdown",
        constants$80.LLVMShutdown$FUNC
    );
    static final FunctionDescriptor LLVMGetVersion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetVersion$MH = RuntimeHelper.downcallHandle(
        "LLVMGetVersion",
        constants$80.LLVMGetVersion$FUNC
    );
    static final FunctionDescriptor LLVMCreateMessage$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateMessage$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateMessage",
        constants$80.LLVMCreateMessage$FUNC
    );
    static final FunctionDescriptor LLVMDisposeMessage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeMessage$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeMessage",
        constants$80.LLVMDisposeMessage$FUNC
    );
    static final FunctionDescriptor LLVMDiagnosticHandler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDiagnosticHandler$MH = RuntimeHelper.downcallHandle(
        constants$80.LLVMDiagnosticHandler$FUNC
    );
}


