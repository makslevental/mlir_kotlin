// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$143 {

    static final FunctionDescriptor LLVMGetLastGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetLastGlobal$MH = RuntimeHelper.downcallHandle(
        "LLVMGetLastGlobal",
        constants$143.LLVMGetLastGlobal$FUNC
    );
    static final FunctionDescriptor LLVMGetNextGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetNextGlobal$MH = RuntimeHelper.downcallHandle(
        "LLVMGetNextGlobal",
        constants$143.LLVMGetNextGlobal$FUNC
    );
    static final FunctionDescriptor LLVMGetPreviousGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetPreviousGlobal$MH = RuntimeHelper.downcallHandle(
        "LLVMGetPreviousGlobal",
        constants$143.LLVMGetPreviousGlobal$FUNC
    );
    static final FunctionDescriptor LLVMDeleteGlobal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDeleteGlobal$MH = RuntimeHelper.downcallHandle(
        "LLVMDeleteGlobal",
        constants$143.LLVMDeleteGlobal$FUNC
    );
    static final FunctionDescriptor LLVMGetInitializer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetInitializer$MH = RuntimeHelper.downcallHandle(
        "LLVMGetInitializer",
        constants$143.LLVMGetInitializer$FUNC
    );
    static final FunctionDescriptor LLVMSetInitializer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMSetInitializer$MH = RuntimeHelper.downcallHandle(
        "LLVMSetInitializer",
        constants$143.LLVMSetInitializer$FUNC
    );
}

