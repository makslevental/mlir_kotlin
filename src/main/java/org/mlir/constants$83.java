// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$83 {

    static final FunctionDescriptor LLVMGetDiagInfoSeverity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetDiagInfoSeverity$MH = RuntimeHelper.downcallHandle(
        "LLVMGetDiagInfoSeverity",
        constants$83.LLVMGetDiagInfoSeverity$FUNC
    );
    static final FunctionDescriptor LLVMGetMDKindIDInContext$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMGetMDKindIDInContext$MH = RuntimeHelper.downcallHandle(
        "LLVMGetMDKindIDInContext",
        constants$83.LLVMGetMDKindIDInContext$FUNC
    );
    static final FunctionDescriptor LLVMGetMDKindID$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMGetMDKindID$MH = RuntimeHelper.downcallHandle(
        "LLVMGetMDKindID",
        constants$83.LLVMGetMDKindID$FUNC
    );
    static final FunctionDescriptor LLVMGetEnumAttributeKindForName$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMGetEnumAttributeKindForName$MH = RuntimeHelper.downcallHandle(
        "LLVMGetEnumAttributeKindForName",
        constants$83.LLVMGetEnumAttributeKindForName$FUNC
    );
    static final FunctionDescriptor LLVMGetLastEnumAttributeKind$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle LLVMGetLastEnumAttributeKind$MH = RuntimeHelper.downcallHandle(
        "LLVMGetLastEnumAttributeKind",
        constants$83.LLVMGetLastEnumAttributeKind$FUNC
    );
    static final FunctionDescriptor LLVMCreateEnumAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LLVMCreateEnumAttribute$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateEnumAttribute",
        constants$83.LLVMCreateEnumAttribute$FUNC
    );
}


