// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$210 {

    static final FunctionDescriptor LLVMOrcCreateCustomMaterializationUnit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateCustomMaterializationUnit$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateCustomMaterializationUnit",
        constants$210.LLVMOrcCreateCustomMaterializationUnit$FUNC
    );
    static final FunctionDescriptor LLVMOrcAbsoluteSymbols$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMOrcAbsoluteSymbols$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcAbsoluteSymbols",
        constants$210.LLVMOrcAbsoluteSymbols$FUNC
    );
    static final FunctionDescriptor LLVMOrcLazyReexports$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMOrcLazyReexports$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcLazyReexports",
        constants$210.LLVMOrcLazyReexports$FUNC
    );
    static final FunctionDescriptor LLVMOrcDisposeMaterializationResponsibility$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcDisposeMaterializationResponsibility$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcDisposeMaterializationResponsibility",
        constants$210.LLVMOrcDisposeMaterializationResponsibility$FUNC
    );
    static final FunctionDescriptor LLVMOrcMaterializationResponsibilityGetTargetDylib$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcMaterializationResponsibilityGetTargetDylib$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcMaterializationResponsibilityGetTargetDylib",
        constants$210.LLVMOrcMaterializationResponsibilityGetTargetDylib$FUNC
    );
    static final FunctionDescriptor LLVMOrcMaterializationResponsibilityGetExecutionSession$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcMaterializationResponsibilityGetExecutionSession$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcMaterializationResponsibilityGetExecutionSession",
        constants$210.LLVMOrcMaterializationResponsibilityGetExecutionSession$FUNC
    );
}


