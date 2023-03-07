// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor mlirRegionDestroy$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion")
    );
    static final MethodHandle mlirRegionDestroy$MH = RuntimeHelper.downcallHandle(
        "mlirRegionDestroy",
        constants$18.mlirRegionDestroy$FUNC
    );
    static final FunctionDescriptor mlirRegionIsNull$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion")
    );
    static final MethodHandle mlirRegionIsNull$MH = RuntimeHelper.downcallHandle(
        "mlirRegionIsNull",
        constants$18.mlirRegionIsNull$FUNC
    );
    static final FunctionDescriptor mlirRegionEqual$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion")
    );
    static final MethodHandle mlirRegionEqual$MH = RuntimeHelper.downcallHandle(
        "mlirRegionEqual",
        constants$18.mlirRegionEqual$FUNC
    );
    static final FunctionDescriptor mlirRegionGetFirstBlock$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirBlock"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion")
    );
    static final MethodHandle mlirRegionGetFirstBlock$MH = RuntimeHelper.downcallHandle(
        "mlirRegionGetFirstBlock",
        constants$18.mlirRegionGetFirstBlock$FUNC
    );
    static final FunctionDescriptor mlirRegionAppendOwnedBlock$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock")
    );
    static final MethodHandle mlirRegionAppendOwnedBlock$MH = RuntimeHelper.downcallHandle(
        "mlirRegionAppendOwnedBlock",
        constants$18.mlirRegionAppendOwnedBlock$FUNC
    );
    static final FunctionDescriptor mlirRegionInsertOwnedBlock$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion"),
        Constants$root.C_LONG_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock")
    );
    static final MethodHandle mlirRegionInsertOwnedBlock$MH = RuntimeHelper.downcallHandle(
        "mlirRegionInsertOwnedBlock",
        constants$18.mlirRegionInsertOwnedBlock$FUNC
    );
}

