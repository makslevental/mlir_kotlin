// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$296 {

    static final FunctionDescriptor LLVMWriteBitcodeToFD$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMWriteBitcodeToFD$MH = RuntimeHelper.downcallHandle(
        "LLVMWriteBitcodeToFD",
        constants$296.LLVMWriteBitcodeToFD$FUNC
    );
    static final FunctionDescriptor LLVMWriteBitcodeToFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle LLVMWriteBitcodeToFileHandle$MH = RuntimeHelper.downcallHandle(
        "LLVMWriteBitcodeToFileHandle",
        constants$296.LLVMWriteBitcodeToFileHandle$FUNC
    );
    static final FunctionDescriptor LLVMWriteBitcodeToMemoryBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LLVMWriteBitcodeToMemoryBuffer$MH = RuntimeHelper.downcallHandle(
        "LLVMWriteBitcodeToMemoryBuffer",
        constants$296.LLVMWriteBitcodeToMemoryBuffer$FUNC
    );
    static final FunctionDescriptor mlirGetDialectHandle__quant__$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirDialectHandle"));
    static final MethodHandle mlirGetDialectHandle__quant__$MH = RuntimeHelper.downcallHandle(
        "mlirGetDialectHandle__quant__",
        constants$296.mlirGetDialectHandle__quant__$FUNC
    );
    static final FunctionDescriptor mlirTypeIsAQuantizedType$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirType")
    );
    static final MethodHandle mlirTypeIsAQuantizedType$MH = RuntimeHelper.downcallHandle(
        "mlirTypeIsAQuantizedType",
        constants$296.mlirTypeIsAQuantizedType$FUNC
    );
    static final FunctionDescriptor mlirQuantizedTypeGetSignedFlag$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle mlirQuantizedTypeGetSignedFlag$MH = RuntimeHelper.downcallHandle(
        "mlirQuantizedTypeGetSignedFlag",
        constants$296.mlirQuantizedTypeGetSignedFlag$FUNC
    );
}

