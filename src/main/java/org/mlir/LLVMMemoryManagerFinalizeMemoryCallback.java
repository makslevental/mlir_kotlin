// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LLVMMemoryManagerFinalizeMemoryCallback {

    int apply(java.lang.foreign.MemoryAddress Opaque, java.lang.foreign.MemoryAddress ErrMsg);
    static MemorySegment allocate(LLVMMemoryManagerFinalizeMemoryCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LLVMMemoryManagerFinalizeMemoryCallback.class, fi, constants$260.LLVMMemoryManagerFinalizeMemoryCallback$FUNC, session);
    }
    static LLVMMemoryManagerFinalizeMemoryCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Opaque, java.lang.foreign.MemoryAddress _ErrMsg) -> {
            try {
                return (int)constants$260.LLVMMemoryManagerFinalizeMemoryCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Opaque, (java.lang.foreign.Addressable)_ErrMsg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


