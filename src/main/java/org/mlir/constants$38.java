// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$38 {

    static final FunctionDescriptor LLVMDisposeRelocationIterator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeRelocationIterator$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeRelocationIterator",
        constants$38.LLVMDisposeRelocationIterator$FUNC
    );
    static final FunctionDescriptor LLVMIsRelocationIteratorAtEnd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMIsRelocationIteratorAtEnd$MH = RuntimeHelper.downcallHandle(
        "LLVMIsRelocationIteratorAtEnd",
        constants$38.LLVMIsRelocationIteratorAtEnd$FUNC
    );
    static final FunctionDescriptor LLVMMoveToNextRelocation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveToNextRelocation$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveToNextRelocation",
        constants$38.LLVMMoveToNextRelocation$FUNC
    );
    static final FunctionDescriptor LLVMGetSymbolName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetSymbolName$MH = RuntimeHelper.downcallHandle(
        "LLVMGetSymbolName",
        constants$38.LLVMGetSymbolName$FUNC
    );
    static final FunctionDescriptor LLVMGetSymbolAddress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetSymbolAddress$MH = RuntimeHelper.downcallHandle(
        "LLVMGetSymbolAddress",
        constants$38.LLVMGetSymbolAddress$FUNC
    );
    static final FunctionDescriptor LLVMGetSymbolSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetSymbolSize$MH = RuntimeHelper.downcallHandle(
        "LLVMGetSymbolSize",
        constants$38.LLVMGetSymbolSize$FUNC
    );
}


