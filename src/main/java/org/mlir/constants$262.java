// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$262 {

    static final FunctionDescriptor LLVMMemoryManagerCreateContextCallback$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMemoryManagerCreateContextCallback$MH = RuntimeHelper.downcallHandle(
        constants$262.LLVMMemoryManagerCreateContextCallback$FUNC
    );
    static final FunctionDescriptor LLVMMemoryManagerNotifyTerminatingCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMemoryManagerNotifyTerminatingCallback$MH = RuntimeHelper.downcallHandle(
        constants$262.LLVMMemoryManagerNotifyTerminatingCallback$FUNC
    );
    static final FunctionDescriptor LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager",
        constants$262.LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager$FUNC
    );
    static final FunctionDescriptor LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks",
        constants$262.LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks$FUNC
    );
}


