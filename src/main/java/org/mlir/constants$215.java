// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$215 {

    static final FunctionDescriptor LLVMOrcCreateDynamicLibrarySearchGeneratorForPath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateDynamicLibrarySearchGeneratorForPath$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateDynamicLibrarySearchGeneratorForPath",
        constants$215.LLVMOrcCreateDynamicLibrarySearchGeneratorForPath$FUNC
    );
    static final FunctionDescriptor LLVMOrcCreateStaticLibrarySearchGeneratorForPath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateStaticLibrarySearchGeneratorForPath$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateStaticLibrarySearchGeneratorForPath",
        constants$215.LLVMOrcCreateStaticLibrarySearchGeneratorForPath$FUNC
    );
    static final FunctionDescriptor LLVMOrcCreateNewThreadSafeContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle LLVMOrcCreateNewThreadSafeContext$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateNewThreadSafeContext",
        constants$215.LLVMOrcCreateNewThreadSafeContext$FUNC
    );
    static final FunctionDescriptor LLVMOrcThreadSafeContextGetContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcThreadSafeContextGetContext$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcThreadSafeContextGetContext",
        constants$215.LLVMOrcThreadSafeContextGetContext$FUNC
    );
    static final FunctionDescriptor LLVMOrcDisposeThreadSafeContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcDisposeThreadSafeContext$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcDisposeThreadSafeContext",
        constants$215.LLVMOrcDisposeThreadSafeContext$FUNC
    );
    static final FunctionDescriptor LLVMOrcCreateNewThreadSafeModule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMOrcCreateNewThreadSafeModule$MH = RuntimeHelper.downcallHandle(
        "LLVMOrcCreateNewThreadSafeModule",
        constants$215.LLVMOrcCreateNewThreadSafeModule$FUNC
    );
}


