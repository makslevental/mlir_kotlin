// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$202 {

    static final FunctionDescriptor LLVMGetTargetMachineTarget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetTargetMachineTarget$MH = RuntimeHelper.downcallHandle(
        "LLVMGetTargetMachineTarget",
        constants$202.LLVMGetTargetMachineTarget$FUNC
    );
    static final FunctionDescriptor LLVMGetTargetMachineTriple$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetTargetMachineTriple$MH = RuntimeHelper.downcallHandle(
        "LLVMGetTargetMachineTriple",
        constants$202.LLVMGetTargetMachineTriple$FUNC
    );
    static final FunctionDescriptor LLVMGetTargetMachineCPU$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetTargetMachineCPU$MH = RuntimeHelper.downcallHandle(
        "LLVMGetTargetMachineCPU",
        constants$202.LLVMGetTargetMachineCPU$FUNC
    );
    static final FunctionDescriptor LLVMGetTargetMachineFeatureString$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetTargetMachineFeatureString$MH = RuntimeHelper.downcallHandle(
        "LLVMGetTargetMachineFeatureString",
        constants$202.LLVMGetTargetMachineFeatureString$FUNC
    );
    static final FunctionDescriptor LLVMCreateTargetDataLayout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateTargetDataLayout$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateTargetDataLayout",
        constants$202.LLVMCreateTargetDataLayout$FUNC
    );
    static final FunctionDescriptor LLVMSetTargetMachineAsmVerbosity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMSetTargetMachineAsmVerbosity$MH = RuntimeHelper.downcallHandle(
        "LLVMSetTargetMachineAsmVerbosity",
        constants$202.LLVMSetTargetMachineAsmVerbosity$FUNC
    );
}

