// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$330 {

    static final FunctionDescriptor mlirLLVMArrayTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mlirLLVMArrayTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirLLVMArrayTypeGet",
        constants$330.mlirLLVMArrayTypeGet$FUNC
    );
    static final FunctionDescriptor mlirLLVMFunctionTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle mlirLLVMFunctionTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirLLVMFunctionTypeGet",
        constants$330.mlirLLVMFunctionTypeGet$FUNC
    );
    static final FunctionDescriptor mlirLLVMStructTypeLiteralGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle mlirLLVMStructTypeLiteralGet$MH = RuntimeHelper.downcallHandle(
        "mlirLLVMStructTypeLiteralGet",
        constants$330.mlirLLVMStructTypeLiteralGet$FUNC
    );
    static final FunctionDescriptor LLVMGetOrInsertComdat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetOrInsertComdat$MH = RuntimeHelper.downcallHandle(
        "LLVMGetOrInsertComdat",
        constants$330.LLVMGetOrInsertComdat$FUNC
    );
    static final FunctionDescriptor LLVMGetComdat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetComdat$MH = RuntimeHelper.downcallHandle(
        "LLVMGetComdat",
        constants$330.LLVMGetComdat$FUNC
    );
    static final FunctionDescriptor LLVMSetComdat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMSetComdat$MH = RuntimeHelper.downcallHandle(
        "LLVMSetComdat",
        constants$330.LLVMSetComdat$FUNC
    );
}


