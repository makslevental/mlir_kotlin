// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor mlirTypeIsAFloat8E4M3FNUZ$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAFloat8E4M3FNUZ$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAFloat8E4M3FNUZ",
        constants$57.mlirTypeIsAFloat8E4M3FNUZ$FUNC
    );
    static final FunctionDescriptor mlirFloat8E4M3FNUZTypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirFloat8E4M3FNUZTypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirFloat8E4M3FNUZTypeGet",
        constants$57.mlirFloat8E4M3FNUZTypeGet$FUNC
    );
    static final FunctionDescriptor mlirTypeIsABF16$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsABF16$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsABF16",
        constants$57.mlirTypeIsABF16$FUNC
    );
    static final FunctionDescriptor mlirBF16TypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirBF16TypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirBF16TypeGet",
        constants$57.mlirBF16TypeGet$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAF16$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAF16$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAF16",
        constants$57.mlirTypeIsAF16$FUNC
    );
    static final FunctionDescriptor mlirF16TypeGet$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirType"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirContext")
    );
    static final MethodHandle mlirF16TypeGet$MH = RuntimeHelper.downcallHandle(
        "mlirF16TypeGet",
        constants$57.mlirF16TypeGet$FUNC
    );
}


