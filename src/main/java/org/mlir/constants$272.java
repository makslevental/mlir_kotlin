// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$272 {

    static final FunctionDescriptor mlirEmitError$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ptr")
        ).withName("MlirLocation"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mlirEmitError$MH = RuntimeHelper.downcallHandle(
        "mlirEmitError",
        constants$272.mlirEmitError$FUNC
    );
    static final FunctionDescriptor lto_get_version$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle lto_get_version$MH = RuntimeHelper.downcallHandle(
        "lto_get_version",
        constants$272.lto_get_version$FUNC
    );
    static final FunctionDescriptor lto_get_error_message$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle lto_get_error_message$MH = RuntimeHelper.downcallHandle(
        "lto_get_error_message",
        constants$272.lto_get_error_message$FUNC
    );
    static final FunctionDescriptor lto_module_is_object_file$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lto_module_is_object_file$MH = RuntimeHelper.downcallHandle(
        "lto_module_is_object_file",
        constants$272.lto_module_is_object_file$FUNC
    );
    static final FunctionDescriptor lto_module_is_object_file_for_target$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lto_module_is_object_file_for_target$MH = RuntimeHelper.downcallHandle(
        "lto_module_is_object_file_for_target",
        constants$272.lto_module_is_object_file_for_target$FUNC
    );
    static final FunctionDescriptor lto_module_has_objc_category$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lto_module_has_objc_category$MH = RuntimeHelper.downcallHandle(
        "lto_module_has_objc_category",
        constants$272.lto_module_has_objc_category$FUNC
    );
}

