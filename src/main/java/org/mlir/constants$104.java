// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$104 {

    static final FunctionDescriptor LLVMPointerTypeInContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMPointerTypeInContext$MH = RuntimeHelper.downcallHandle(
        "LLVMPointerTypeInContext",
        constants$104.LLVMPointerTypeInContext$FUNC
    );
    static final FunctionDescriptor LLVMGetPointerAddressSpace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetPointerAddressSpace$MH = RuntimeHelper.downcallHandle(
        "LLVMGetPointerAddressSpace",
        constants$104.LLVMGetPointerAddressSpace$FUNC
    );
    static final FunctionDescriptor LLVMVectorType$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMVectorType$MH = RuntimeHelper.downcallHandle(
        "LLVMVectorType",
        constants$104.LLVMVectorType$FUNC
    );
    static final FunctionDescriptor LLVMScalableVectorType$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMScalableVectorType$MH = RuntimeHelper.downcallHandle(
        "LLVMScalableVectorType",
        constants$104.LLVMScalableVectorType$FUNC
    );
    static final FunctionDescriptor LLVMGetVectorSize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetVectorSize$MH = RuntimeHelper.downcallHandle(
        "LLVMGetVectorSize",
        constants$104.LLVMGetVectorSize$FUNC
    );
    static final FunctionDescriptor LLVMVoidTypeInContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMVoidTypeInContext$MH = RuntimeHelper.downcallHandle(
        "LLVMVoidTypeInContext",
        constants$104.LLVMVoidTypeInContext$FUNC
    );
}

