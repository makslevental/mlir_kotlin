// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LLVMOrcMaterializationUnitDestroyFunction {

    void apply(java.lang.foreign.MemoryAddress Ctx);
    static MemorySegment allocate(LLVMOrcMaterializationUnitDestroyFunction fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LLVMOrcMaterializationUnitDestroyFunction.class, fi, constants$205.LLVMOrcMaterializationUnitDestroyFunction$FUNC, session);
    }
    static LLVMOrcMaterializationUnitDestroyFunction ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Ctx) -> {
            try {
                constants$205.LLVMOrcMaterializationUnitDestroyFunction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Ctx);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

