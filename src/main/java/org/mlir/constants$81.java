// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$81 {

    static final FunctionDescriptor LLVMYieldCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMYieldCallback$MH = RuntimeHelper.downcallHandle(
        constants$81.LLVMYieldCallback$FUNC
    );
    static final FunctionDescriptor LLVMContextCreate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMContextCreate$MH = RuntimeHelper.downcallHandle(
        "LLVMContextCreate",
        constants$81.LLVMContextCreate$FUNC
    );
    static final FunctionDescriptor LLVMGetGlobalContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMGetGlobalContext$MH = RuntimeHelper.downcallHandle(
        "LLVMGetGlobalContext",
        constants$81.LLVMGetGlobalContext$FUNC
    );
    static final FunctionDescriptor LLVMContextSetDiagnosticHandler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMContextSetDiagnosticHandler$MH = RuntimeHelper.downcallHandle(
        "LLVMContextSetDiagnosticHandler",
        constants$81.LLVMContextSetDiagnosticHandler$FUNC
    );
    static final FunctionDescriptor LLVMContextGetDiagnosticHandler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMContextGetDiagnosticHandler$MH = RuntimeHelper.downcallHandle(
        "LLVMContextGetDiagnosticHandler",
        constants$81.LLVMContextGetDiagnosticHandler$FUNC
    );
}


