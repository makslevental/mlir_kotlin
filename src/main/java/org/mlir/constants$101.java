// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$101 {

    static final FunctionDescriptor LLVMStructCreateNamed$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMStructCreateNamed$MH = RuntimeHelper.downcallHandle(
        "LLVMStructCreateNamed",
        constants$101.LLVMStructCreateNamed$FUNC
    );
    static final FunctionDescriptor LLVMGetStructName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetStructName$MH = RuntimeHelper.downcallHandle(
        "LLVMGetStructName",
        constants$101.LLVMGetStructName$FUNC
    );
    static final FunctionDescriptor LLVMStructSetBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMStructSetBody$MH = RuntimeHelper.downcallHandle(
        "LLVMStructSetBody",
        constants$101.LLVMStructSetBody$FUNC
    );
    static final FunctionDescriptor LLVMCountStructElementTypes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCountStructElementTypes$MH = RuntimeHelper.downcallHandle(
        "LLVMCountStructElementTypes",
        constants$101.LLVMCountStructElementTypes$FUNC
    );
    static final FunctionDescriptor LLVMGetStructElementTypes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetStructElementTypes$MH = RuntimeHelper.downcallHandle(
        "LLVMGetStructElementTypes",
        constants$101.LLVMGetStructElementTypes$FUNC
    );
    static final FunctionDescriptor LLVMStructGetTypeAtIndex$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMStructGetTypeAtIndex$MH = RuntimeHelper.downcallHandle(
        "LLVMStructGetTypeAtIndex",
        constants$101.LLVMStructGetTypeAtIndex$FUNC
    );
}


