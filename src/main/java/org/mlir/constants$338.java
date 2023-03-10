// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$338 {

    static final FunctionDescriptor mlirStringAttrTypedGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirStringAttrTypedGet$MH = RuntimeHelper.downcallHandle(
        "mlirStringAttrTypedGet",
        constants$338.mlirStringAttrTypedGet$FUNC
    );
    static final FunctionDescriptor mlirStringAttrGetValue$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirStringAttrGetValue$MH = RuntimeHelper.downcallHandle(
        "mlirStringAttrGetValue",
        constants$338.mlirStringAttrGetValue$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsASymbolRef$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsASymbolRef$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsASymbolRef",
        constants$338.mlirAttributeIsASymbolRef$FUNC
    );
    static final FunctionDescriptor mlirSymbolRefAttrGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirSymbolRefAttrGet$MH = RuntimeHelper.downcallHandle(
        "mlirSymbolRefAttrGet",
        constants$338.mlirSymbolRefAttrGet$FUNC
    );
    static final FunctionDescriptor mlirSymbolRefAttrGetRootReference$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirSymbolRefAttrGetRootReference$MH = RuntimeHelper.downcallHandle(
        "mlirSymbolRefAttrGetRootReference",
        constants$338.mlirSymbolRefAttrGetRootReference$FUNC
    );
    static final FunctionDescriptor mlirSymbolRefAttrGetLeafReference$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirSymbolRefAttrGetLeafReference$MH = RuntimeHelper.downcallHandle(
        "mlirSymbolRefAttrGetLeafReference",
        constants$338.mlirSymbolRefAttrGetLeafReference$FUNC
    );
}


