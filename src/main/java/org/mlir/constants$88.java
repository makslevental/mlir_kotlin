// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$88 {

    static final FunctionDescriptor LLVMCopyModuleFlagsMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCopyModuleFlagsMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMCopyModuleFlagsMetadata",
        constants$88.LLVMCopyModuleFlagsMetadata$FUNC
    );
    static final FunctionDescriptor LLVMDisposeModuleFlagsMetadata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeModuleFlagsMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeModuleFlagsMetadata",
        constants$88.LLVMDisposeModuleFlagsMetadata$FUNC
    );
    static final FunctionDescriptor LLVMModuleFlagEntriesGetFlagBehavior$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMModuleFlagEntriesGetFlagBehavior$MH = RuntimeHelper.downcallHandle(
        "LLVMModuleFlagEntriesGetFlagBehavior",
        constants$88.LLVMModuleFlagEntriesGetFlagBehavior$FUNC
    );
    static final FunctionDescriptor LLVMModuleFlagEntriesGetKey$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMModuleFlagEntriesGetKey$MH = RuntimeHelper.downcallHandle(
        "LLVMModuleFlagEntriesGetKey",
        constants$88.LLVMModuleFlagEntriesGetKey$FUNC
    );
    static final FunctionDescriptor LLVMModuleFlagEntriesGetMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMModuleFlagEntriesGetMetadata$MH = RuntimeHelper.downcallHandle(
        "LLVMModuleFlagEntriesGetMetadata",
        constants$88.LLVMModuleFlagEntriesGetMetadata$FUNC
    );
    static final FunctionDescriptor LLVMGetModuleFlag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMGetModuleFlag$MH = RuntimeHelper.downcallHandle(
        "LLVMGetModuleFlag",
        constants$88.LLVMGetModuleFlag$FUNC
    );
}


