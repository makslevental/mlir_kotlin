// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor mlirAttributeGetType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeGetType$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeGetType",
        constants$27.mlirAttributeGetType$FUNC
    );
    static final FunctionDescriptor mlirAttributeGetTypeID$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirTypeID"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeGetTypeID$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeGetTypeID",
        constants$27.mlirAttributeGetTypeID$FUNC
    );
    static final FunctionDescriptor mlirAttributeIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeIsNull",
        constants$27.mlirAttributeIsNull$FUNC
    );
    static final FunctionDescriptor mlirAttributeEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeEqual$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeEqual",
        constants$27.mlirAttributeEqual$FUNC
    );
    static final FunctionDescriptor mlirAttributePrint$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirAttributePrint$MH = RuntimeHelper.downcallHandle(
        "mlirAttributePrint",
        constants$27.mlirAttributePrint$FUNC
    );
    static final FunctionDescriptor mlirAttributeDump$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirAttributeDump$MH = RuntimeHelper.downcallHandle(
        "mlirAttributeDump",
        constants$27.mlirAttributeDump$FUNC
    );
}


