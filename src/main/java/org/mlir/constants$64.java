// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$64 {

    static final FunctionDescriptor mlirMemRefTypeContiguousGetChecked$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirMemRefTypeContiguousGetChecked$MH = RuntimeHelper.downcallHandle(
        "mlirMemRefTypeContiguousGetChecked",
        constants$64.mlirMemRefTypeContiguousGetChecked$FUNC
    );
    static final FunctionDescriptor mlirUnrankedMemRefTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirUnrankedMemRefTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirUnrankedMemRefTypeGet",
        constants$64.mlirUnrankedMemRefTypeGet$FUNC
    );
    static final FunctionDescriptor mlirUnrankedMemRefTypeGetChecked$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirUnrankedMemRefTypeGetChecked$MH = RuntimeHelper.downcallHandle(
        "mlirUnrankedMemRefTypeGetChecked",
        constants$64.mlirUnrankedMemRefTypeGetChecked$FUNC
    );
    static final FunctionDescriptor mlirMemRefTypeGetLayout$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirMemRefTypeGetLayout$MH = RuntimeHelper.downcallHandle(
        "mlirMemRefTypeGetLayout",
        constants$64.mlirMemRefTypeGetLayout$FUNC
    );
    static final FunctionDescriptor mlirMemRefTypeGetAffineMap$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAffineMap"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirMemRefTypeGetAffineMap$MH = RuntimeHelper.downcallHandle(
        "mlirMemRefTypeGetAffineMap",
        constants$64.mlirMemRefTypeGetAffineMap$FUNC
    );
    static final FunctionDescriptor mlirMemRefTypeGetMemorySpace$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirAttribute"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirMemRefTypeGetMemorySpace$MH = RuntimeHelper.downcallHandle(
        "mlirMemRefTypeGetMemorySpace",
        constants$64.mlirMemRefTypeGetMemorySpace$FUNC
    );
}


