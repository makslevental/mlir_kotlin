// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$36 {

    static final FunctionDescriptor LLVMObjectFileIsSymbolIteratorAtEnd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMObjectFileIsSymbolIteratorAtEnd$MH = RuntimeHelper.downcallHandle(
        "LLVMObjectFileIsSymbolIteratorAtEnd",
        constants$36.LLVMObjectFileIsSymbolIteratorAtEnd$FUNC
    );
    static final FunctionDescriptor LLVMDisposeSectionIterator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeSectionIterator$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeSectionIterator",
        constants$36.LLVMDisposeSectionIterator$FUNC
    );
    static final FunctionDescriptor LLVMMoveToNextSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveToNextSection$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveToNextSection",
        constants$36.LLVMMoveToNextSection$FUNC
    );
    static final FunctionDescriptor LLVMMoveToContainingSection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveToContainingSection$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveToContainingSection",
        constants$36.LLVMMoveToContainingSection$FUNC
    );
    static final FunctionDescriptor LLVMDisposeSymbolIterator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMDisposeSymbolIterator$MH = RuntimeHelper.downcallHandle(
        "LLVMDisposeSymbolIterator",
        constants$36.LLVMDisposeSymbolIterator$FUNC
    );
    static final FunctionDescriptor LLVMMoveToNextSymbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMMoveToNextSymbol$MH = RuntimeHelper.downcallHandle(
        "LLVMMoveToNextSymbol",
        constants$36.LLVMMoveToNextSymbol$FUNC
    );
}


