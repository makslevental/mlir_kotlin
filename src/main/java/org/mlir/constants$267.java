// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$267 {

    static final FunctionDescriptor mlirSparseTensorEncodingAttrGetIndexBitWidth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirAttribute")
    );
    static final MethodHandle mlirSparseTensorEncodingAttrGetIndexBitWidth$MH = RuntimeHelper.downcallHandle(
        "mlirSparseTensorEncodingAttrGetIndexBitWidth",
        constants$267.mlirSparseTensorEncodingAttrGetIndexBitWidth$FUNC
    );
    static final FunctionDescriptor mlirRegisterSparseTensorPasses$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle mlirRegisterSparseTensorPasses$MH = RuntimeHelper.downcallHandle(
        "mlirRegisterSparseTensorPasses",
        constants$267.mlirRegisterSparseTensorPasses$FUNC
    );
    static final FunctionDescriptor mlirCreateSparseTensorPostSparsificationRewrite$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirPass"));
    static final MethodHandle mlirCreateSparseTensorPostSparsificationRewrite$MH = RuntimeHelper.downcallHandle(
        "mlirCreateSparseTensorPostSparsificationRewrite",
        constants$267.mlirCreateSparseTensorPostSparsificationRewrite$FUNC
    );
    static final FunctionDescriptor mlirRegisterSparseTensorPostSparsificationRewrite$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle mlirRegisterSparseTensorPostSparsificationRewrite$MH = RuntimeHelper.downcallHandle(
        "mlirRegisterSparseTensorPostSparsificationRewrite",
        constants$267.mlirRegisterSparseTensorPostSparsificationRewrite$FUNC
    );
    static final FunctionDescriptor mlirCreateSparseTensorPreSparsificationRewrite$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ptr")
    ).withName("MlirPass"));
    static final MethodHandle mlirCreateSparseTensorPreSparsificationRewrite$MH = RuntimeHelper.downcallHandle(
        "mlirCreateSparseTensorPreSparsificationRewrite",
        constants$267.mlirCreateSparseTensorPreSparsificationRewrite$FUNC
    );
    static final FunctionDescriptor mlirRegisterSparseTensorPreSparsificationRewrite$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle mlirRegisterSparseTensorPreSparsificationRewrite$MH = RuntimeHelper.downcallHandle(
        "mlirRegisterSparseTensorPreSparsificationRewrite",
        constants$267.mlirRegisterSparseTensorPreSparsificationRewrite$FUNC
    );
}

