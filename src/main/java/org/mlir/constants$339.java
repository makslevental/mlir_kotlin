// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$339 {

    static final FunctionDescriptor mlirSymbolRefAttrGetNumNestedReferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirSymbolRefAttrGetNumNestedReferences$MH = RuntimeHelper.downcallHandle(
        "mlirSymbolRefAttrGetNumNestedReferences",
        constants$339.mlirSymbolRefAttrGetNumNestedReferences$FUNC
    );
    static final FunctionDescriptor mlirSymbolRefAttrGetNestedReference$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mlirSymbolRefAttrGetNestedReference$MH = RuntimeHelper.downcallHandle(
        "mlirSymbolRefAttrGetNestedReference",
        constants$339.mlirSymbolRefAttrGetNestedReference$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsAFlatSymbolRef$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsAFlatSymbolRef$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsAFlatSymbolRef",
        constants$339.mlirAttributeIsAFlatSymbolRef$FUNC
    );
    static final FunctionDescriptor mlirFlatSymbolRefAttrGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("length")
        ).withName("MlirStringRef")
    );
    static final MethodHandle mlirFlatSymbolRefAttrGet$MH = RuntimeHelper.downcallHandle(
        "mlirFlatSymbolRefAttrGet",
        constants$339.mlirFlatSymbolRefAttrGet$FUNC
    );
    static final FunctionDescriptor mlirFlatSymbolRefAttrGetValue$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("MlirStringRef"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirFlatSymbolRefAttrGetValue$MH = RuntimeHelper.downcallHandle(
        "mlirFlatSymbolRefAttrGetValue",
        constants$339.mlirFlatSymbolRefAttrGetValue$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsAType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsAType$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsAType",
        constants$339.mlirAttributeIsAType$FUNC
    );
}


