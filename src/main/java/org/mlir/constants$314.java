// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$314 {

    static final FunctionDescriptor mlirRegisterTransformsViewOpGraph$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle mlirRegisterTransformsViewOpGraph$MH = RuntimeHelper.downcallHandle(
        "mlirRegisterTransformsViewOpGraph",
        constants$314.mlirRegisterTransformsViewOpGraph$FUNC
    );
    static final FunctionDescriptor LLVMDebugMetadataVersion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle LLVMDebugMetadataVersion$MH = RuntimeHelper.downcallHandle(
        "LLVMDebugMetadataVersion",
        constants$314.LLVMDebugMetadataVersion$FUNC
    );
    static final FunctionDescriptor LLVMGetModuleDebugMetadataVersion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMGetModuleDebugMetadataVersion$MH = RuntimeHelper.downcallHandle(
        "LLVMGetModuleDebugMetadataVersion",
        constants$314.LLVMGetModuleDebugMetadataVersion$FUNC
    );
    static final FunctionDescriptor LLVMStripModuleDebugInfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMStripModuleDebugInfo$MH = RuntimeHelper.downcallHandle(
        "LLVMStripModuleDebugInfo",
        constants$314.LLVMStripModuleDebugInfo$FUNC
    );
    static final FunctionDescriptor LLVMCreateDIBuilderDisallowUnresolved$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateDIBuilderDisallowUnresolved$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateDIBuilderDisallowUnresolved",
        constants$314.LLVMCreateDIBuilderDisallowUnresolved$FUNC
    );
    static final FunctionDescriptor LLVMCreateDIBuilder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMCreateDIBuilder$MH = RuntimeHelper.downcallHandle(
        "LLVMCreateDIBuilder",
        constants$314.LLVMCreateDIBuilder$FUNC
    );
}


