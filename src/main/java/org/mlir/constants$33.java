// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor wcstoimax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoimax$MH = RuntimeHelper.downcallHandle(
        "wcstoimax",
        constants$33.wcstoimax$FUNC
    );
    static final FunctionDescriptor wcstoumax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoumax$MH = RuntimeHelper.downcallHandle(
        "wcstoumax",
        constants$33.wcstoumax$FUNC
    );
    static final FunctionDescriptor _OSSwapInt16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle _OSSwapInt16$MH = RuntimeHelper.downcallHandle(
        "_OSSwapInt16",
        constants$33._OSSwapInt16$FUNC
    );
    static final FunctionDescriptor _OSSwapInt32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _OSSwapInt32$MH = RuntimeHelper.downcallHandle(
        "_OSSwapInt32",
        constants$33._OSSwapInt32$FUNC
    );
    static final FunctionDescriptor _OSSwapInt64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _OSSwapInt64$MH = RuntimeHelper.downcallHandle(
        "_OSSwapInt64",
        constants$33._OSSwapInt64$FUNC
    );
    static final FunctionDescriptor __darwin_check_fd_set_overflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __darwin_check_fd_set_overflow$MH = RuntimeHelper.downcallHandle(
        "__darwin_check_fd_set_overflow",
        constants$33.__darwin_check_fd_set_overflow$FUNC
    );
}


