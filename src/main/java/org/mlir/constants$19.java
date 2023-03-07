// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$19 {

    static final FunctionDescriptor mlirRegionInsertOwnedBlockAfter$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock")
    );
    static final MethodHandle mlirRegionInsertOwnedBlockAfter$MH = RuntimeHelper.downcallHandle(
        "mlirRegionInsertOwnedBlockAfter",
        constants$19.mlirRegionInsertOwnedBlockAfter$FUNC
    );
    static final FunctionDescriptor mlirRegionInsertOwnedBlockBefore$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock")
    );
    static final MethodHandle mlirRegionInsertOwnedBlockBefore$MH = RuntimeHelper.downcallHandle(
        "mlirRegionInsertOwnedBlockBefore",
        constants$19.mlirRegionInsertOwnedBlockBefore$FUNC
    );
    static final FunctionDescriptor mlirOperationGetFirstRegion$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirOperation")
    );
    static final MethodHandle mlirOperationGetFirstRegion$MH = RuntimeHelper.downcallHandle(
        "mlirOperationGetFirstRegion",
        constants$19.mlirOperationGetFirstRegion$FUNC
    );
    static final FunctionDescriptor mlirRegionGetNextInOperation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirRegion"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirRegion")
    );
    static final MethodHandle mlirRegionGetNextInOperation$MH = RuntimeHelper.downcallHandle(
        "mlirRegionGetNextInOperation",
        constants$19.mlirRegionGetNextInOperation$FUNC
    );
    static final FunctionDescriptor mlirBlockCreate$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirBlock"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirBlockCreate$MH = RuntimeHelper.downcallHandle(
        "mlirBlockCreate",
        constants$19.mlirBlockCreate$FUNC
    );
    static final FunctionDescriptor mlirBlockDestroy$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirBlock")
    );
    static final MethodHandle mlirBlockDestroy$MH = RuntimeHelper.downcallHandle(
        "mlirBlockDestroy",
        constants$19.mlirBlockDestroy$FUNC
    );
}


