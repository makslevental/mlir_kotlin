// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$192 {

    static final FunctionDescriptor LLVMBuildFence$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMBuildFence$MH = RuntimeHelper.downcallHandle(
        "LLVMBuildFence",
        constants$192.LLVMBuildFence$FUNC
    );
    static final FunctionDescriptor LLVMBuildAtomicRMW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMBuildAtomicRMW$MH = RuntimeHelper.downcallHandle(
        "LLVMBuildAtomicRMW",
        constants$192.LLVMBuildAtomicRMW$FUNC
    );
    static final FunctionDescriptor LLVMBuildAtomicCmpXchg$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMBuildAtomicCmpXchg$MH = RuntimeHelper.downcallHandle(
        "LLVMBuildAtomicCmpXchg",
        constants$192.LLVMBuildAtomicCmpXchg$FUNC
    );
    static final FunctionDescriptor LLVMGetNumMaskElements$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNumMaskElements$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNumMaskElements",
        constants$192.LLVMGetNumMaskElements$FUNC
    );
    static final FunctionDescriptor LLVMGetUndefMaskElem$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle LLVMGetUndefMaskElem$MH = RuntimeHelper.downcallHandle(
        "LLVMGetUndefMaskElem",
        constants$192.LLVMGetUndefMaskElem$FUNC
    );
    static final FunctionDescriptor LLVMGetMaskValue$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMGetMaskValue$MH = RuntimeHelper.downcallHandle(
        "LLVMGetMaskValue",
        constants$192.LLVMGetMaskValue$FUNC
    );
}


