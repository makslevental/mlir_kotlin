// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$126 {

    static final FunctionDescriptor LLVMConstPointerNull$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMConstPointerNull$MH = RuntimeHelper.downcallHandle(
        "LLVMConstPointerNull",
        constants$126.LLVMConstPointerNull$FUNC
    );
    static final FunctionDescriptor LLVMConstInt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMConstInt$MH = RuntimeHelper.downcallHandle(
        "LLVMConstInt",
        constants$126.LLVMConstInt$FUNC
    );
    static final FunctionDescriptor LLVMConstIntOfArbitraryPrecision$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMConstIntOfArbitraryPrecision$MH = RuntimeHelper.downcallHandle(
        "LLVMConstIntOfArbitraryPrecision",
        constants$126.LLVMConstIntOfArbitraryPrecision$FUNC
    );
    static final FunctionDescriptor LLVMConstIntOfString$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle LLVMConstIntOfString$MH = RuntimeHelper.downcallHandle(
        "LLVMConstIntOfString",
        constants$126.LLVMConstIntOfString$FUNC
    );
    static final FunctionDescriptor LLVMConstIntOfStringAndSize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle LLVMConstIntOfStringAndSize$MH = RuntimeHelper.downcallHandle(
        "LLVMConstIntOfStringAndSize",
        constants$126.LLVMConstIntOfStringAndSize$FUNC
    );
    static final FunctionDescriptor LLVMConstReal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle LLVMConstReal$MH = RuntimeHelper.downcallHandle(
        "LLVMConstReal",
        constants$126.LLVMConstReal$FUNC
    );
}


